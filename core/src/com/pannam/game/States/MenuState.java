package com.pannam.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pannam.game.FlappyDemo;

/**
 * Created by pannam on 3/18/2017.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playBth;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBth = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        //open and close
        sb.begin();
        sb.draw(background, 0,0, FlappyDemo.WIDTH,FlappyDemo.HEIGHT);
        sb.draw(playBth,(FlappyDemo.WIDTH/2)-(playBth.getWidth()/2),FlappyDemo.HEIGHT/2);
        sb.end();


    }
}
