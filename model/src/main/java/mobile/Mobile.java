package mobile;

import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	private final int bddId;
	private int x;
	private int y;
	private ISprite sprite;
	

	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId){
	    super(sprite, permeability);
	    this.bddId = bddId;
	}

	public int getBddId() {
		return bddId;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
}