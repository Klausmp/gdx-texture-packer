package de.klausmp.texturepacker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import de.klausmp.texturepacker.Main;

public class DesktopLauncher {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Main(), config);
		TexturePacker.Settings settings = new TexturePacker.Settings();
		settings.maxWidth = 4096;
		settings.maxHeight = 4096;
		settings.edgePadding = true;
		settings.duplicatePadding = true;
		settings.filterMin = Texture.TextureFilter.Linear;
		settings.filterMag = Texture.TextureFilter.Linear;
		TexturePacker.process(settings, "textures", ".", "spriteSheed");

	}
}
