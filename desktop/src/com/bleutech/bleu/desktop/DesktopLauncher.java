package com.bleutech.bleu.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bleutech.bleu.Bleu;
import com.bleutech.bleu.lib.BleuConstants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = BleuConstants.WIDTH;
		config.height = BleuConstants.HEIGHT;
		new LwjglApplication(new Bleu(), config);
	}
}
