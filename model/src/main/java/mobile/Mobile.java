package mobile;

import java.awt.Point;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	private final int bddId;
	protected Point position;
	private ISprite sprite;
	protected ILorannWorldEntity lorannWorldEntity;
	

	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity){
	    super(sprite, permeability);
	    this.bddId = bddId;
	    this.position = new Point();
	    this.lorannWorldEntity = lorannWorldEntity;
	}

	public int getBddId() {
		return bddId;
	}


	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getX() {
		return position.x;
	}
	
	public void setX(int x) {
		this.position.x = x;
		//this.getLorannWorldEntity().setMobilehasChanged();
	}

	public int getY() {
		return position.y;
	}

	public void setY(int y) {
		this.position.y = y;
		//this.getLorannWorldEntity().setMobilehasChanged();
	}
	
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
	public boolean isMovePossible(final int x, final int y){
		return(this.getLorannWorldEntity().getElement(x,y).getPermeability() == (Permeability.MEETINGABLE)||this.getLorannWorldEntity().getElement(x,y).getPermeability() == (Permeability.PENETRABLE )); 
	}
	
	
    public void moveUp(){
    	if (isMovePossible(getX(), getY() - 1)){
    		setY(getY() - 1);
    	}
	}
	
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
	}
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) {
		super.setLorannWorldEntity(lorannWorldEntity);;
		this.setX(x);
		this.setY(y);
	}
	
}