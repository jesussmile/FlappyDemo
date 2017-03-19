package com.pannam.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pannam.game.States.GameStateManager;
import com.pannam.game.States.MenuState;

public class FlappyDemo extends ApplicationAdapter {
	//width of the screen for desktop
	public static final int WIDTH = 1440;
	//height of the screen for desktop
	public static final int HEIGHT = 2560;

	//title
	public static final String TITLE = "Flappy Bird";

	//create a game state manager
	private GameStateManager gsm;
	private SpriteBatch batch;



//	Texture img;




	@Override
	public void create () {
		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
		//add gamestatemanager
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));

	}

	@Override
	//render is on loop so create gamestatemanager
	public void render () {
		//clears the screen
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);


//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
//		img.dispose();
	}
}
