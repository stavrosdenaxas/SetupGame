package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;

/**
 * Created by ET on 3/26/2016.
 */
public class TitleScreen implements Screen {

    private MyGdxGame game;
    Texture title;
    private OrthographicCamera gamecam;
    private Viewport gamePort;

    public TitleScreen (MyGdxGame game) {

        this.game = game;
        gamecam = new OrthographicCamera();
        title = new Texture("title.png");
        gamePort = new FitViewport(MyGdxGame.V_WIDTH, MyGdxGame.V_HEIGHT, gamecam);
        System.out.println("This is the TitleScreen");

    }



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();

        game.batch.draw(title, MyGdxGame.V_WIDTH / 5,MyGdxGame.V_HEIGHT / 3 );
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new MenuScreen(game));
        }
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
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
