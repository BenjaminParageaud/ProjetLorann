package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.ISprite;
import contract.Permeability;
import element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	private final int bddId;
	private ISprite sprite;
	protected ILorannWorldEntity lorannWorldEntity;
	private int x;
	private int y;

	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity){
	    super(sprite, permeability);
	    this.bddId = bddId;
	    this.lorannWorldEntity = lorannWorldEntity;
	}

	public int getBddId() {
		return bddId;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
		this.getLorannWorldEntity().setMobilehasChanged();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.getLorannWorldEntity().setMobilehasChanged();
	}
	
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
	
   /* public void moveUp(){
    	if (getisMovePossible(getX(), getY() - 1)){
    		setY(getY() - 1);
    	}
	}
	/*
	public void moveDown(){
    	if (isMovePossible(getX(), getY() + 1)){
    		setY(getY() + 1);
    	}
	}
	
	public void moveRight(){
    	if (isMovePossible(getX() + 1, getY())){
    		setX(getX() + 1);
    	}
	}
	
	public void moveLeft(){
    	if (isMovePossible(getX() - 1, getY())){
    		setX(getX() - 1);
    	}
	}*/
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) {
		super.setLorannWorldEntity(lorannWorldEntity);;
		this.lorannWorldEntity = lorannWorldEntity;
		this.setX(x);
		this.setY(y);
	}
	
}