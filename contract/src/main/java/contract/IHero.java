/*
 * 
 */
package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IHero.
 */
public interface IHero extends IMobile{

	//public void orientationMove (OrientationOrder orientationOrder);
	
	/**
	 * Move up.
	 *
	 * @return true, if successful
	 */
	public boolean moveUp();
	
	/**
	 * Move down.
	 *
	 * @return true, if successful
	 */
	public boolean moveDown();
	
	/**
	 * Move right.
	 *
	 * @return true, if successful
	 */
	public boolean moveRight();
	
	/**
	 * Move left.
	 *
	 * @return true, if successful
	 */
	public boolean moveLeft();
	
	/**
	 * Move up right.
	 *
	 * @return true, if successful
	 */
	public boolean moveUpRight();

	/**
	 * Move up left.
	 *
	 * @return true, if successful
	 */
	public boolean moveUpLeft();

	/**
	 * Move down right.
	 *
	 * @return true, if successful
	 */
	public boolean moveDownRight();

	/**
	 * Move down left.
	 *
	 * @return true, if successful
	 */
	public boolean moveDownLeft();

	/**
	 * Checks if is move possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is move possible
	 */
	public boolean isMovePossible(final int x, final int y);
	
	/* (non-Javadoc)
	 * @see contract.IMobile#getX()
	 */
	public int getX() ;
	
	/* (non-Javadoc)
	 * @see contract.IMobile#setX(int)
	 */
	public void setX(int x) ;


	/* (non-Javadoc)
	 * @see contract.IMobile#getY()
	 */
	public int getY() ;
	
	/* (non-Javadoc)
	 * @see contract.IMobile#setY(int)
	 */
	public void setY(int y);

	/* (non-Javadoc)
	 * @see contract.IMobile#setSprite(contract.ISprite)
	 */
	public void setSprite(ISprite sprite);


	/* (non-Javadoc)
	 * @see contract.IElement#setLorannWorldEntity(contract.ILorannWorldEntity)
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity);


	/* (non-Javadoc)
	 * @see contract.IElement#setPermeability(contract.Permeability)
	 */
	public void setPermeability(Permeability permeability);

	
	/* (non-Javadoc)
	 * @see contract.IMobile#getSprite()
	 */
	public ISprite getSprite();
	
	/* (non-Javadoc)
	 * @see contract.IElement#getPermeability()
	 */
	public Permeability getPermeability() ;
	
	//public int getAlive();

	//public void setAlive(int alive);
	
	
}
