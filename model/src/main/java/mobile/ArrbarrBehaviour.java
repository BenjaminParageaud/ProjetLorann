/*
 * 
 */
package mobile;

import java.util.Random;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;
import model.LorannWorldEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class CargavBehaviour.
 */
public class ArrbarrBehaviour implements IStrategy{

	
	private ILorannWorldEntity lorannWorldEntity;
	/**
	 * Instantiates a new cargav behaviour.
	 */
	public ArrbarrBehaviour(){
		
		
	}

	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
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
