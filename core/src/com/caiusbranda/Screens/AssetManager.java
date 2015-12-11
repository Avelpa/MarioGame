/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caiusbranda.Screens;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 *
 * @author kobed6328
 */
public class AssetManager {
    private static TextureAtlas atlas;
    public static TextureRegion block;
    public static TextureRegion marioStandRight;
    public static TextureRegion marioStandLeft;
    
    public static Animation marioRunRight;
    public static Animation marioRunLeft;
    
    public static void load()
    {
        atlas = new TextureAtlas("mario.pack");
        block = atlas.findRegion("mario/stoneBlock");
        marioStandRight = atlas.findRegion("mario/stand");
        marioStandLeft = new TextureRegion(marioStandRight);
        marioStandLeft.flip(true, false);
        
        Array<AtlasRegion> run = atlas.findRegions("mario/run");
        marioRunRight = new Animation(0.1f, run);
        
        run = atlas.findRegions("mario/run");
        marioRunLeft = new Animation(0.1f, run);
        for(TextureRegion r: marioRunLeft.getKeyFrames())
        {
            r.flip(true, false);
        }
    }
}
