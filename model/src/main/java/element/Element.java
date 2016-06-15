package element;

import java.awt.Image;

import aedt.showboard.ISquare;

public abstract class Element implements ISquare{
	
	private Sprite sprite;
	private Permeability permeability;

	
	public Element(final Sprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public Image getImage() {
		return this.getSprite().getImage();
	}
	
	public Sprite getSprite() {
		return sprite;
	}


	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
}