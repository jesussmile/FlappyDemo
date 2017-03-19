package com.pannam.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by pannam on 3/18/2017.
 */

public abstract class State {
    //cam
    protected OrthographicCamera cam;

    //3 direction camera XYZ
    protected Vector3 mouse;

    //gamestate manager manage  a state. say put pause before the current game state
    protected GameStateManager gsm;

    //constructor
    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    //methods
    protected abstract void handleInput();
    //dt is the time to render from one frame to the another
    public abstract void update(float dt);
    //container for everything to render
    public abstract void render(SpriteBatch sb);



}
