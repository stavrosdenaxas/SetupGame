package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.mygdx.game.MyGdxGame;


/**
 * Created by ET on 3/26/2016.
 */
public class MenuScreen implements Screen {
    private Stage stage;
    private MyGdxGame game;
    private Texture background;
    private Texture playMenuButtonTexture;
    private Texture optionsMenuButtonTexture;
    private Texture creditsMenuButtonTexture;
    private Button playMenuButton;
    private Button optionsMenuButton;
    private Button creditsMenuButton;


    public MenuScreen(MyGdxGame game){
        this.game = game;
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        playMenuButtonTexture = new Texture("playMenuButton.png");
        optionsMenuButtonTexture = new Texture("optionsMenuButton.png");
        creditsMenuButtonTexture = new Texture("creditsMenuButton.png");
        System.out.println("This is the MenuScreen");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    game.batch.begin();

        game.batch.draw(playMenuButtonTexture, 100, 600);
        game.batch.draw(optionsMenuButtonTexture, 100, 400);
        game.batch.draw(creditsMenuButtonTexture, 100, 200);

    game.batch.end();


        if (Gdx.input.isTouched()) {
            game.setScreen(new PlayScreen(game));
        }

    }

    @Override
    public void resize(int width, int height) {

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
