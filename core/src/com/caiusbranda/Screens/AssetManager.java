/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caiusbranda.Screens;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author kobed6328
 */
public class AssetManager {
    private static TextureAtlas atlas;
    public static TextureRegion block;
    public static TextureRegion marioStand;
    
    public static void load()
    {
        atlas = new TextureAtlas("mario.pack");
        block = atlas.findRegion("stoneBlock.png");
        marioStand = atlas.findRegion("stand.png");
    }
}
