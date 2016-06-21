/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class CargavBehaviour.
 */
public class CargavBehaviour implements IStrategy{

	
	/** The lorann world entity. */
	private ILorannWorldEntity lorannWorldEntity;
	/**
	 * Instantiates a new cargav behaviour.
	 */
	public CargavBehaviour(){
		
	}

	/**
	 * Gets the lorann world entity.
	 *
	 * @return the lorann world entity
	 */
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	/**
	 * Sets the lorann world entity.
	 *
	 * @param lorannWorldEntity the new lorann world entity
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	
		public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
			
			if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
				monster.moveUpLeft();
			}
			
			if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
				monster.moveUpRight();
			}
			
			if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
				monster.moveDownLeft();
			}
			
			if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
				monster.moveDownRight();
			}
			
			if(lorannWorldEntity.getHero().getY()==monster.getY() && lorannWorldEntity.getHero().getX()<monster.getX()){
				monster.moveLeft();
			}
			
			if(lorannWorldEntity.getHero().getY()==monster.getY() && lorannWorldEntity.getHero().getX()>monster.getX()){
				monster.moveRight();
			}
			
			if(lorannWorldEntity.getHero().getY()<monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
				monster.moveUp();
			}
			
			if(lorannWorldEntity.getHero().getY()>monster.getY() && lorannWorldEntity.getHero().getX()==monster.getX()){
				monster.moveDown();
			}
			
	}
}
