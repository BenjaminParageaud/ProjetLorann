/*
 * 
 */
package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMobile.
 */
public interface IMobile extends IElement{

	/**
	 * Gets the bdd id.
	 *
	 * @return the bdd id
	 */
	public int getBddId();

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() ;
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) ;

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() ;

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) ;
	
	/* (non-Javadoc)
	 * @see contract.IElement#getSprite()
	 */
	public ISprite getSprite() ;

	/* (non-Javadoc)
	 * @see contract.IElement#setSprite(contract.ISprite)
	 */
	public void setSprite(ISprite sprite);
	
	//public boolean isMovePossible(final int x, final int y);
	
    //public void moveUp();
	
	/*public void moveDown();
	
	public void moveRight();
	
	public void moveLeft();*/
	
	/* (non-Javadoc)
	 * @see contract.IElement#getLorannWorldEntity()
	 */
	public ILorannWorldEntity getLorannWorldEntity();

	/**
	 * Sets the lorann world entity.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 * @param x the x
	 * @param y the y
	 */
	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) ;
	
	
}
