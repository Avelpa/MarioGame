/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 *
 * @author branc2347
 */
public class GameScreen implements Screen {

    public final int V_WIDTH = 800;
    public final int V_HEIGHT = 600;
    private Viewport viewport;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Texture logo;

    public GameScreen() {
        camera = new OrthographicCamera();
        viewport = new FitViewport(V_WIDTH, V_HEIGHT, camera);
        camera.position.x = V_WIDTH / 2f;
        camera.position.y = V_HEIGHT / 2f;

        batch = new SpriteBatch();
        logo = new Texture("badlogic.jpg");

    }

    @Override
    public void show() {
    }

    @Override
    public void render(float f) {
        Gdx.gl20.glClearColor(0, 0, 0, 0);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);


        if (Gdx.input.isKeyPressed(Keys.D)) {
            camera.position.x -= 10f;
        }
        if (Gdx.input.isKeyPressed(Keys.A)) {
            camera.position.x += 10f;
        }
        if (Gdx.input.isKeyPressed(Keys.S)) {
            camera.position.y += 10f;
        }
        if (Gdx.input.isKeyPressed(Keys.W)) {
            camera.position.y -= 10f;
        }
        camera.update();
        //links the renderer to the camera
        batch.setProjectionMatrix(camera.combined);

        //tells the renderer this is the list
        batch.begin();
        //start the list of things to draw
        batch.draw(logo, V_WIDTH / 2f - logo.getWidth() / 2f, V_HEIGHT / 2f - logo.getHeight() / 2f);
        //finish listing stuff to draw
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
}
