/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.caiusbranda.Screens.WorldRenderer;
import com.caiusbranda.model.Player;
import com.caiusbranda.model.World;

/**
 *
 * @author branc2347
 */
public class MainGame implements Screen {

    private World world;
    private Player player;
    private WorldRenderer renderer;
    
    public MainGame() {
        world = new World();
        player = world.getPlayer();
        renderer = new WorldRenderer(world);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float f) {
        
        if (Gdx.input.isKeyPressed(Keys.D))
        {
            player.setVelocityX(2f);
        }
        if (Gdx.input.isKeyPressed(Keys.A)){
            player.setVelocityX(-2f);
        }
        
        renderer.render(f);
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
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
