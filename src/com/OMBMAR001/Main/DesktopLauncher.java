package com.OMBMAR001.Main;

import com.OMBMAR001.ApplicationDriver.*;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	
	public static void main(String[] args) {
		
		LwjglApplicationConfiguration cfg =
			new LwjglApplicationConfiguration();
		cfg.title = "Attack of The Germs";
		cfg.width = 1024;
		cfg.height = 768;
		cfg.useGL20 = true;
		cfg.resizable = true;
		
	

		
		new LwjglApplication(new MyGdxGame(), cfg);
		
	}
	
}
