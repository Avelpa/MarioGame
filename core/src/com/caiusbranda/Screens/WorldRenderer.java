/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caiusbranda.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.caiusbranda.model.Player;
import com.caiusbranda.model.World;

/**
 *
 * @author branc2347
 */
public class WorldRenderer {
    
    public final int V_WIDTH = 800;
    public final int V_HEIGHT = 600;
    
    private World world;
    private Player player;
    
    private Viewport viewport;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    
    public WorldRenderer(World w)
    {
        world = w;
        
        player = world.getPlayer();
        
        camera = new OrthographicCamera();
        viewport = new FitViewport(V_WIDTH, V_HEIGHT, camera);
        camera.position.x = V_WIDTH / 2f;
        camera.position.y = V_HEIGHT / 2f;
        
        batch = new SpriteBatch();
        
        AssetManager.load();
    }

    public void render(float delta)
    {
        Gdx.gl20.glClearColor(0, 0, 0, 0);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);


        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            camera.position.x -= 10f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            camera.position.x += 10f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            camera.position.y += 10f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            camera.position.y -= 10f;
        }
        camera.update();
        //links the renderer to the camera
        batch.setProjectionMatrix(camera.combined);

        //tells the renderer this is the list
        batch.begin();
        //start the list of things to draw
        batch.draw(AssetManager.marioStand, player.getX(), player.getY());
        //finish listing stuff to draw
        batch.end();
    }
    
    public void resize(int width, int height)
    {
        viewport.update(width, height);
    }
}
