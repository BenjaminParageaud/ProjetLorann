package mobile;

import element.Permeability;
import element.Sprite;
import model.LorannWorldEntity;
import element.Element;


public abstract class Mobile extends Element {
	
	private int x;
	private int y;
	private LorannWorldEntity lorannWorldEntity;

	
	public LorannWorldEntity getLorannWorld() {
		return lorannWorldEntity;
	}


	public void setLorannWorldEntity(final LorannWorldEntity lorannWorldEntity, final int x, final int y) {
		this.lorannWorldEntity = lorannWorldEntity;
		this.setX(x);
		this.setY(y);
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
		//getLorannWorld().setMobileHasChanged();
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
		//getLorannWorld().setMobileHasChanged();
	}


	public Mobile(final Sprite sprite, final Permeability permeability){
	    super(sprite, permeability);
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