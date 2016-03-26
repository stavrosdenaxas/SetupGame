package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.SplashScreen;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	public static final int V_WIDTH = 480;
	public static final int V_HEIGHT = 800;

	public Game game;

	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new SplashScreen(this));

	}

	@Override
	public void render() {

		super.render();
	}


	public void dispose() {

	}
}