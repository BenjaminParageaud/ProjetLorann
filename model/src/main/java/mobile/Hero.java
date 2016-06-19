package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.Permeability;
import element.Sprite;


public class Hero extends Mobile implements IHero{

	private int x;
	private int y;
	private ILorannWorldEntity lorannWorldEntity;
	
	
	public Hero(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1,  lorannWorldEntity);
	}
	
	
	public void moveUp(){
		super.moveUp();
	}
	
	public void moveDown(){
		super.moveDown();
	}
	
	public void moveRight(){
		super.moveRight();
	}
	
	public void moveLeft(){
		super.moveLeft();
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
	
}