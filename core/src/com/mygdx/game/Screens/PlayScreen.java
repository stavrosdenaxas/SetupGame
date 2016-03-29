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
 * Created by ET on 3/21/2016.
 */
public class PlayScreen implements Screen {

    private MyGdxGame game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;

    public PlayScreen (MyGdxGame game) {

        this.game = game;
        texture = new Texture("test.png");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(MyGdxGame.V_WIDTH, MyGdxGame.V_HEIGHT, gamecam);

        System.out.println("This is the PlayScreen");
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {


        //renders all graphics
        renderGame();

        //logic of location of sprites
        gameLogic();

        //handles user input
        inputLogic();


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
    public void renderGame(){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        game.batch.begin();
        game.batch.draw(texture, 0, 0);



        game.batch.end();

    }
    public void gameLogic(){




    }

    public void inputLogic(){


    }


}
