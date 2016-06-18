package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.Permeability;
import element.Sprite;


public class Hero extends Mobile{

	private int x;
	private int y;
	private ILorannWorldEntity lorannWorldEntity;
	
	
	public Hero(){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1);
	}
	
	
	private boolean isMovePossible(final int x, final int y){
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
	
}