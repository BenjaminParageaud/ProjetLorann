package mobile;

import element.Permeability;

import element.Sprite;


public class Hero extends Mobile {
	
	public Hero(){
	
		super(new Sprite("Le nom de l'image"), Permeability.HEROABLE);
		
	}
}