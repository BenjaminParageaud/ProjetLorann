package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.Permeability;
import element.Sprite;


public class Hero extends Mobile{

	private int x;
	private int y;
	private ILorannWorldEntity lorannWorldEntity;
	
	
	public Hero(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1,  lorannWorldEntity);
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