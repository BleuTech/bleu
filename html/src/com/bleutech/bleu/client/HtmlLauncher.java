package com.bleutech.bleu.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.bleutech.bleu.Bleu;
import com.bleutech.bleu.lib.BleuConstants;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(BleuConstants.WIDTH, BleuConstants.HEIGHT);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new Bleu();
        }
}