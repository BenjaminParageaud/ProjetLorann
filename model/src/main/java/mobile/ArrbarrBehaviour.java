/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class ArrbarrBehaviour.
 */
public class ArrbarrBehaviour implements IStrategy{

	/**
	 * Instantiates a new arrbarr behaviour.
	 */
	public ArrbarrBehaviour(){
		
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		
		if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			monster.moveDownRight();
		}
		
		if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			monster.moveDownLeft();
		}
		
		if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			monster.moveUpRight();
		}
		
		if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			monster.moveUpLeft();
		}
		
		if(lorannWorldEntity.getHero().getY()==monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			monster.moveRight();
		}
		
		if(lorannWorldEntity.getHero().getY()==monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			monster.moveLeft();
		}
		
		if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
			monster.moveDown();
		}
		
		if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
			monster.moveUp();
		}
		
		
		
		
		
		
	}
}
