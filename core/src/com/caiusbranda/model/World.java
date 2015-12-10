/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caiusbranda.model;

import com.badlogic.gdx.utils.Array;

/**
 *
 * @author branc2347
 */
public class World {
    private Array<Block> blocks;
    private Player player;
    
    public World()
    {
        player = new Player(100, 100, 16, 32);
        blocks = new Array<Block>();
        demoLevel();
    }
    
    private void demoLevel()
    {
        for (int i = 0; i < 50; i ++)
        {
            Block b = new Block(i*16, 0, 16, 16);
            blocks.add(b);
        }
        
        blocks.add(new Block(48, 16, 16, 16));
        blocks.add(new Block(96, 32, 16, 16));
        blocks.add(new Block(112, 32, 16, 16));
    }
    
    public void update(float delta)
    {
        
    }
    
    public Player getPlayer()
    {
        return player;
    }
    
    public Array<Block> getBlocks()
    {
        return blocks;
    }
}
