/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import element.Element;


// TODO: Auto-generated Javadoc
/**
 * The Class Mobile.
 */
public abstract class Mobile extends Element implements IMobile{
	
	/** The bdd id. */
	private final int bddId;
	
	/** The sprite. */
	private ISprite sprite;
	
	/** The lorann world entity. */
	protected ILorannWorldEntity lorannWorldEntity;
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	

	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite the sprite
	 * @param permeability the permeability
	 * @param bddId the bdd id
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity){
	    super(sprite, permeability);
	    this.bddId = bddId;
	    this.lorannWorldEntity = lorannWorldEntity;
	}

	/* (non-Javadoc)
	 * @see contract.IMobile#getBddId()
	 */
	public int getBddId() {
		return bddId;
	}

	/* (non-Javadoc)
	 * @see contract.IMobile#getX()
	 */
	public int getX() {
		return x;
	}
	
	/* (non-Javadoc)
	 * @see contract.IMobile#setX(int)
	 */
	public void setX(int x) {
		this.x = x;
		this.getLorannWorldEntity().setMobilehasChanged();
	}

	/* (non-Javadoc)
	 * @see contract.IMobile#getY()
	 */
	public int getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see contract.IMobile#setY(int)
	 */
	public void setY(int y) {
		this.y = y;
		this.getLorannWorldEntity().setMobilehasChanged();
	}
	
	/* (non-Javadoc)
	 * @see element.Element#getSprite()
	 */
	public ISprite getSprite() {
		return sprite;
	}

	/* (non-Javadoc)
	 * @see element.Element#setSprite(contract.ISprite)
	 */
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
	
	/* (non-Javadoc)
    * @see element.Element#getLorannWorldEntity()
    */
   public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	/* (non-Javadoc)
	 * @see contract.IMobile#setLorannWorldEntity(contract.ILorannWorldEntity, int, int)
	 */
	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) {
		super.setLorannWorldEntity(lorannWorldEntity);;
		this.lorannWorldEntity = lorannWorldEntity;
		this.setX(x);
		this.setY(y);
	}
	
}