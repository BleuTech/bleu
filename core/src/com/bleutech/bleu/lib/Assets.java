package com.bleutech.bleu.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {

	public static Texture tile;
	public static Texture tileActivated;
	public static Texture tileError;


	public static void load () {

		tile = new Texture(Gdx.files.internal("tile.png"));
		tileActivated = new Texture(Gdx.files.internal("tile-activated.png"));
		tileError = new Texture(Gdx.files.internal("tile-error.png"));
	}
}
