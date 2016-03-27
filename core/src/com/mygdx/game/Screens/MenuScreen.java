package com.mygdx.game.Screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;


/**
 * Created by ET on 3/26/2016.
 */
public class MenuScreen implements Screen {
    private MyGdxGame game;
    private Texture background;
    private Texture playMenuButton;
    private Texture optionsMenuButton;
    private Texture creditsMenuButton;

    public MenuScreen(MyGdxGame game){
        this.game = game;
        playMenuButton = new Texture("playMenuButton.png");
        optionsMenuButton = new Texture("optionsMenuButton.png");
        creditsMenuButton = new Texture("creditsMenuButton.png");
        System.out.println("This is the MenuScreen");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
    game.batch.begin();
    game.batch.end();


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
