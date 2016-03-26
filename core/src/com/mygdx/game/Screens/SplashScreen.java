package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;

/**
 * Created by ET on 3/26/2016.
 */
public class SplashScreen implements Screen{


    private MyGdxGame game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private long startTime;

    public SplashScreen (MyGdxGame game) {

        this.game = game;
        texture = new Texture("test.png");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(MyGdxGame.V_WIDTH, MyGdxGame.V_HEIGHT, gamecam);
        System.out.println("This is the SplashScreen");
        System.out.println(Gdx.graphics.getFramesPerSecond());

    }





    @Override
    public void show() {
        startTime = TimeUtils.millis();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(texture, 140, 300);
        game.batch.end();
        System.out.println(Gdx.graphics.getDeltaTime());
        if (TimeUtils.millis()>(startTime+5000)) game.setScreen(new TitleScreen(game));
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
