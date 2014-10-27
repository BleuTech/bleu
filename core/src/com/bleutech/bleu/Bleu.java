package com.bleutech.bleu;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bleutech.bleu.lib.Assets;
import com.bleutech.bleu.screen.GameScreen;

public class Bleu extends Game {
	
	public GameScreen gameScreen;
	
	@Override
	public void create () {
		Assets.load();
		gameScreen = new GameScreen(this);
		this.setScreen(gameScreen);
	}
}
