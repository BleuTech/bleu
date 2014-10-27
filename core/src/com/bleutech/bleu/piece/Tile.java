package com.bleutech.bleu.piece;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.bleutech.bleu.lib.Assets;

public class Tile {
	private Texture normal;
	private Texture activated;
	private Texture error;
	private int x;
	private int y;
	private int state;
	private int id;
	
	private static final int STATE_NORMAL = 0;
	private static final int STATE_ACTIVATED = 1;
	private static final int STATE_ERROR = 2;
	
	public Tile (int x, int y) {
		this.x = x;
		this.y = y;
		state = 0;
		normal = Assets.tile;
		activated = Assets.tileActivated;
		error = Assets.tileError;
	}
	
	public void draw (SpriteBatch batch, Vector3 touch, int id) {
		if (touch.x > x && touch.x < x + 64 && touch.y > y && touch.y < y + 64) {
			activate();
		}
		if (state == STATE_NORMAL) {
			batch.draw(normal, x, y);
		}
		else if (state == STATE_ACTIVATED) {
			batch.draw(activated, x, y);
		}
	}
	
	
	private void activate () {
		if (state == STATE_NORMAL) {
			state = STATE_ACTIVATED;
		}

	}
	
	public void setID (int id) {
		this.id = id;
	}
}
