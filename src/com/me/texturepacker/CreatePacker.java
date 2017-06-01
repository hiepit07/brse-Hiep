package com.me.texturepacker;

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

public class CreatePacker {

	private static String SOURCE, DESTINATION, FILENAME;

	private void CreateTexturePacker(){
		Settings st = new Settings();
		st.maxWidth = 1024;
		st.maxHeight = 1024;
		TexturePacker2.process(st, SOURCE, DESTINATION, FILENAME);
	}
	
	public void setPathAtlas(String src, String des, String filename) {
		SOURCE = src;
		DESTINATION = des;
		FILENAME = filename;
		CreateTexturePacker();
	}
}
