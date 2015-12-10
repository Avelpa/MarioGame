/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caiusbranda.model;

import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author branc2347
 */
public class Player extends Entity {
//the actual state Mario is in

    private final float X_MAL_VELO = 2.0f;
    private final float Y_MAL_VELO = 4.0f;
    private final float DAMP = 0.9f;
    private State state;
    private Vector2 velocity;
    private Vector2 acceleration;
    boolean isFacingLeft;
    //animation state counter
    private float stateTime;

    public Player(float x, float y, float width, float height) {
        super(x, y, width, height);
        state = State.STANDING;
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 0);
        isFacingLeft = false;
        stateTime = 0;
    }

    public void update(float delta) {
    }

    public void setVelocityX(float x) {
        velocity.x = x;
    }

    public void setVelocityY(float y) {
        velocity.y = y;
    }
    public void setState(State s){
        state = s;
    }

    //states for mario
    public enum State {

        STANDING, RUNNING, JUMPING
    }
}
