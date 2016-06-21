package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.IStrategy;

public class SpellBehaviour implements IStrategy{

	
	private ILorannWorldEntity lorannWorldEntity;
	
	public SpellBehaviour(){
		
	}
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		
		/*
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
			
		*/
	}

	
	
}
