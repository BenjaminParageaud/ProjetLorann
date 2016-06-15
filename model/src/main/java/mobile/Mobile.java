package mobile;

import element.Permeability;
import element.Sprite;
import element.Element;


public abstract class Mobile extends Element  {

	
	public Mobile(final Sprite sprite, final Permeability permeability){
	    super(sprite, permeability);
	}
	
	
	public boolean isMovePossible(final int x, final int y){
		return true;
	}
	
	
	public void moveUp(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void moveRight(){
		
	}
	
	public void moveLeft(){
		
	}
	
}