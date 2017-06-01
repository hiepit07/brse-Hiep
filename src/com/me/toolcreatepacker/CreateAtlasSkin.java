package com.me.toolcreatepacker;

import com.me.texturepacker.CreatePacker;

public class CreateAtlasSkin {

	private static final int GAME52 = 0;
	private static final int GAMEPLAY = 1;
	private static final int TEST = 2;
	private static int select = GAMEPLAY;
	
	public static void main(String[] args) throws Exception {
		CreatePacker packer = new CreatePacker();
		String source = "", destination = "", filename = "";
		switch (select) {

		case GAME52:
			source = "ResourcePacker/TextureResource";
			destination = "../52laV1.1.0/android/assets/TextureResourcePacked/main";
//			destination = "../Game52/Game52-android/assets/TextureResourcePacked/main";
			filename = "main.txt";
			packer.setPathAtlas(source, destination, filename);
			
			source = "ResourcePacker/SkinResource";
			destination = "../52laV1.1.0/android/assets/SkinResourcePacked/skin";
//			destination = "../Game52/Game52-android/assets/SkinResourcePacked/skin";
			filename = "skin.atlas";
			packer.setPathAtlas(source, destination, filename);
			break;
		case GAMEPLAY:
			source = "RessourcePackerGame/TextureResource";
			destination = "../52laV1.1.0/android/assets/TextureResourcePackedGame/main";
//			destination = "../Game52/Game52-android/assets/TextureResourcePackedGame/main";
			filename = "main.txt";
			packer.setPathAtlas(source, destination, filename);
			
//			source = "ResourcePacker/SkinResource";
//			destination = "../Game52/Game52-android/assets/SkinResourcePacked/skin";
//			filename = "skin.atlas";
//			packer.setPathAtlas(source, destination, filename);
			break;
		case TEST:
			source = "RessourcePackerTest/TextureResource";
			destination = "RessourcePackerTest/TextureResourcePackedGame/main";
			filename = "main.txt";
			packer.setPathAtlas(source, destination, filename);
			break;
		default:
			break;
		}
	}
}