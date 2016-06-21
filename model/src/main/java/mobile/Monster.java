/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.IStrategy;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLessFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public abstract class Monster extends Mobile implements IMonster,IStrategy{

	/** The coordonate. */
	public int coordonate;

	/** The strategy. */
	private IStrategy strategy;



	/**
	 * Instantiates a new monster.
	 *
	 * @param sprite the sprite
	 * @param permeability the permeability
	 * @param bddId the bdd id
	 * @param lorannWorldEntity the lorann world entity
	 * @param strategy the strategy
	 */
	public Monster(final Sprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity , IStrategy strategy  ){

		super(sprite, permeability, bddId, lorannWorldEntity);
		setStrategy(strategy);

	}

	/* (non-Javadoc)
	 * @see contract.IMonster#getStrategy()
	 */
	public IStrategy getStrategy() {
		return strategy;
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#setStrategy(contract.IStrategy)
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#isMovePossible(int, int)
	 */
	public boolean isMovePossible(final int x, final int y){
		if(getLorannWorldEntity().getElement(x, y) == null){
			return true;
		}
		else if(x == getLorannWorldEntity().getHero().getX() && y  == getLorannWorldEntity().getHero().getY()){
			getLorannWorldEntity().setAlive(1);
			getLorannWorldEntity().setMobilehasChanged();
			return true; 
		}
		else if((getLorannWorldEntity().getHero().getX() ) == x && y ==(getLorannWorldEntity().getHero().getY() -1) ){
			setX(34);
			getLorannWorldEntity().setMobilehasChanged();
			return false;
		}
		else if(getLorannWorldEntity().getElement(x, y) != null){
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			if(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE)){
				return true;
			}
			return false;
		}
		return false;
	}



	public void moveUp(){

		if (isMovePossible(getX(), getY() - 1)){
			setY(getY() - 1);
		}
	}


	/* (non-Javadoc)
	 * @see contract.IMonster#moveDown()
	 */
	public void moveDown(){
		if (isMovePossible(getX(), getY() + 1)){
			setY(getY() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveRight()
	 */
	public void moveRight(){
		if (isMovePossible(getX() + 1, getY())){
			setX(getX() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveLeft()
	 */
	public void moveLeft(){
		if (isMovePossible(getX() - 1, getY())){
			setX(getX() - 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveUpRight()
	 */
	public void moveUpRight(){
		if (isMovePossible(getX() + 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveUpLeft()
	 */
	public void moveUpLeft(){
		if (isMovePossible(getX() - 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() - 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveDownRight()
	 */
	public void moveDownRight(){
		if (isMovePossible(getX() + 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMonster#moveDownLeft()
	 */
	public void moveDownLeft(){
		if (isMovePossible(getX() - 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() - 1);
		}
	}



	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}


}