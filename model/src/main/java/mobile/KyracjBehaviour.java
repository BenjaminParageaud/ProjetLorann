/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class KyracjBehaviour.
 */
public class KyracjBehaviour implements IStrategy{

	/**
	 * Instantiates a new kyracj behaviour.
	 */
	public KyracjBehaviour(){
			
		}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		
		int diffX = monster.getX()- lorannWorldEntity.getHero().getX();
		int diffY = monster.getY() - lorannWorldEntity.getHero().getY();
		
		if(lorannWorldEntity.getHero().getY()< monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			if(Math.abs(diffX)<(Math.abs(diffY))){
				monster.moveUp();
			}
			
			if(Math.abs(diffX)==(Math.abs(diffY))){
				monster.moveUpLeft();
			}
			
			if(Math.abs(diffX)>(Math.abs(diffY))){
				monster.moveLeft();
			}
		}
		
		
		if(lorannWorldEntity.getHero().getY()< monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			if(Math.abs(diffX)<(Math.abs(diffY))){
				monster.moveUp();
			}
			
			if(Math.abs(diffX)==(Math.abs(diffY))){
				monster.moveUpRight();
			}
			
			if(Math.abs(diffX)>(Math.abs(diffY))){
				monster.moveRight();
			}
		}
		
		if(lorannWorldEntity.getHero().getY()> monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			if(Math.abs(diffX)<(Math.abs(diffY))){
				monster.moveDown();
			}
			
			if(Math.abs(diffX)==(Math.abs(diffY))){
				monster.moveDownLeft();
			}
			
			if(Math.abs(diffX)>(Math.abs(diffY))){
				monster.moveLeft();
			}
		}
		
		if(lorannWorldEntity.getHero().getY()> monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			if(Math.abs(diffX)<(Math.abs(diffY))){
				monster.moveDown();
			}
			
			if(Math.abs(diffX)==(Math.abs(diffY))){
				monster.moveDownRight();
			}
			
			if(Math.abs(diffX)>(Math.abs(diffY))){
				monster.moveRight();
			}
		}
		
		if(lorannWorldEntity.getHero().getY()== monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
			monster.moveDownLeft();
		}
		
		if(lorannWorldEntity.getHero().getY()== monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
			monster.moveDownRight();
		}
		if(lorannWorldEntity.getHero().getY()< monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
			monster.moveUp();
		}
		if(lorannWorldEntity.getHero().getY()> monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
			monster.moveDown();
		}
		
		
		
	}
}
