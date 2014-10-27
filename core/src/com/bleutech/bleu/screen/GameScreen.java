package com.bleutech.bleu.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.bleutech.bleu.Bleu;
import com.bleutech.bleu.lib.Assets;
import com.bleutech.bleu.lib.BleuConstants;
import com.bleutech.bleu.piece.Tile;

public class GameScreen implements Screen {

	private Bleu game;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Rectangle rect1;
	private Tile tile1;
	private Tile[][] tiles;
	private int tileID;
	private float stateTime;
	private Vector3 touch;
	
	public GameScreen(Bleu game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, BleuConstants.WIDTH, BleuConstants.HEIGHT);
		
		batch = new SpriteBatch();
		
		rect1 = new Rectangle(100, 100, 100, 100);
		tiles = new Tile[9][9];
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				tiles[i][j] = new Tile(i * 64 + 32, j * 64 + 32);
			}
		}
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1F, 1F, 1F, 1F);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		
		stateTime += delta;
		
		
		touch = camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				tileID = i * j;
				tiles[i][j].draw(batch, touch, tileID);
			}
		}
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
