package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite{
	
	private Image image;
	private static final String FILE = "";

	
	public Sprite(final String image){
		try{
			this.image = ImageIO.read(new File("C:/Users/CLEMENT/git/ProjetLorann/model/sprite/" + image));
		}catch(final IOException e){
			e.printStackTrace();
		}
	}


	public Image getImage() {
		return image;
	}


	public static String getFile() {
		return FILE;
	}
	
}