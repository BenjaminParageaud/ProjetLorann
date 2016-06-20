package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.IStrategy;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLessFactory;

public abstract class Monster extends Mobile implements IMonster,IStrategy{
	
	public int coordonate;
	
	private IStrategy strategy;
	
	
	public Monster(final Sprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity , IStrategy strategy  ){

		super(sprite, permeability, bddId, lorannWorldEntity);
	setStrategy(strategy);
		
	}

	

	
	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean isMovePossible(final int x, final int y){
		if(getLorannWorldEntity().getElement(x, y) == null){
			return(MobileFactory.getFromBddId(2, lorannWorldEntity).getPermeability() == (Permeability.MONSTERABLE)); 
		}
		else {//if (MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)) {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			return( MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )); 
		}
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

	public void moveUpRight(){
		if (isMovePossible(getX() + 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() + 1);
		}
	}

	public void moveUpLeft(){
		if (isMovePossible(getX() - 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() - 1);
		}
	}
	
	public void moveDownRight(){
		if (isMovePossible(getX() + 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() + 1);
		}
	}

	public void moveDownLeft(){
		if (isMovePossible(getX() - 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() - 1);
		}
	}
	
	
}