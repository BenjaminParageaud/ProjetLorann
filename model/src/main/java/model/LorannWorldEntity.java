package model;

/**
 * The Class LorWorld.
 *
 * @author Clement Moreau
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IMobile;
import contract.IMonster;
import contract.IMotionLess;
import element.Element;
import motionless.MotionLessFactory;
import contract.IHero;
import contract.ILorannWorldEntity;




public class LorannWorldEntity extends Observable implements ILorannWorldEntity{ 
	public IMotionLess	elements[][];
	public ArrayList<IMobile>	mobiles;
	public ArrayList<IMonster>	monsters;
	private IHero	hero;
	public int m;



	public LorannWorldEntity(){
		this.elements = new IMotionLess[40][40];
		this.mobiles = new ArrayList<IMobile>();
		this.monsters = new ArrayList<IMonster>();
		
	}
	
	
	public void addElement(final IMotionLess element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}
	
	public void addMonster(IMonster monster, int x, int y){
		this.monsters.add(monster);
		this.mobiles.add(monster);
		monster.setLorannWorldEntity(this, x, y);
		//mobile.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}


	
	public void addHero(final IHero hero, final int x, final int y) {
		this.setHero(hero);
		hero.setX(x);
		hero.setY(y);
	}

	public void setElements(IMotionLess[][] elements) {
		this.elements = elements;
	}
	
	public boolean setElement( IMotionLess element, final int x, final int y) {
		this.elements[x][y] = element;
		return true;
	}

	public IMotionLess[][] getElements(){
		return this.elements;		
	}

	public IMotionLess getElement(final int x, final int y) {
		return this.elements[x][y];
		
	}
	
	public IHero getHero(){
		return this.hero;
	}
	public void setHero(final IHero hero) {
		this.hero = hero;
		this.setChanged();
	}

	public ArrayList<IMobile> getMobiles(){
		return this.mobiles;
	}

	
	public void play(){
		for(;;){
			this.setChanged();
			this.notifyObservers();
			try{
				Thread.sleep(125);
			} catch (final InterruptedException e){
				e.printStackTrace();
			}
			
			for (final IMonster monster : this.monsters){
			System.out.println("xxxxxxxxx");	
			System.out.println(monster.getStrategy());
			System.out.println("yyyyyyyyyy");
			monster.getStrategy().animate(monster, this);
			}
		}
	}
		

	
	
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	public void notifyObservers(){
		super.notifyObservers();
	}

	public Observable getObservable() {
		return this;
	}




}
