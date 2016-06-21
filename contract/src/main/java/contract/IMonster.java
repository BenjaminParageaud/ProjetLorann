/*
 * 
 */
package contract;



// TODO: Auto-generated Javadoc
/**
 * The Interface IMonster.
 */
public interface IMonster extends IMobile{
	
	
	/**
	 * Gets the strategy.
	 *
	 * @return the strategy
	 */
	public IStrategy getStrategy() ;

	/**
	 * Sets the strategy.
	 *
	 * @param strategy the new strategy
	 */
	public void setStrategy(IStrategy strategy) ;

	/**
	 * Checks if is move possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is move possible
	 */
	public boolean isMovePossible(final int x, final int y);
	
	/**
	 * Move up.
	 */
	public void moveUp();

	/**
	 * Move down.
	 */
	public void moveDown();

	/**
	 * Move right.
	 */
	public void moveRight();

	/**
	 * Move left.
	 */
	public void moveLeft();

	/**
	 * Move up right.
	 */
	public void moveUpRight();

	/**
	 * Move up left.
	 */
	public void moveUpLeft();
	
	/**
	 * Move down right.
	 */
	public void moveDownRight();

	/**
	 * Move down left.
	 */
	public void moveDownLeft();

	/* (non-Javadoc)
	 * @see contract.IMobile#getBddId()
	 */
	public int getBddId();

	/* (non-Javadoc)
	 * @see contract.IElement#getPermeability()
	 */
	public Permeability getPermeability();

	/* (non-Javadoc)
	 * @see contract.IMobile#getX()
	 */
	public int getX() ;

	/* (non-Javadoc)
	 * @see contract.IMobile#setX(int)
	 */
	public void setX(int x);

	/* (non-Javadoc)
	 * @see contract.IMobile#getY()
	 */
	public int getY();

	/* (non-Javadoc)
	 * @see contract.IMobile#setY(int)
	 */
	public void setY(int y);

	/* (non-Javadoc)
	 * @see contract.IMobile#getLorannWorldEntity()
	 */
	public ILorannWorldEntity getLorannWorldEntity();

	/* (non-Javadoc)
	 * @see contract.IElement#setLorannWorldEntity(contract.ILorannWorldEntity)
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity);
		
	}
	
	

