/*
 * 
 */
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




// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorldEntity.
 */
public class LorannWorldEntity extends Observable implements ILorannWorldEntity{ 
	
	/** The elements. */
	public IMotionLess	elements[][];
	
	/** The mobiles. */
	public ArrayList<IMobile>	mobiles;
	
	/** The monsters. */
	public ArrayList<IMonster>	monsters;
	
	/** The hero. */
	private IHero	hero;
	
	/** The m. */
	public int m;



	/**
	 * Instantiates a new lorann world entity.
	 */
	public LorannWorldEntity(){
		this.elements = new IMotionLess[40][40];
		this.mobiles = new ArrayList<IMobile>();
		this.monsters = new ArrayList<IMonster>();
		
	}
	
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#addElement(contract.IMotionLess, int, int)
	 */
	public void addElement(final IMotionLess element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#addMonster(contract.IMonster, int, int)
	 */
	public void addMonster(IMonster monster, int x, int y){
		this.monsters.add(monster);
		this.mobiles.add(monster);
		monster.setLorannWorldEntity(this, x, y);
		//mobile.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}


	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#addHero(contract.IHero, int, int)
	 */
	public void addHero(final IHero hero, final int x, final int y) {
		this.setHero(hero);
		hero.setX(x);
		hero.setY(y);
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#setElements(contract.IMotionLess[][])
	 */
	public void setElements(IMotionLess[][] elements) {
		this.elements = elements;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#setElement(contract.IMotionLess, int, int)
	 */
	public boolean setElement( IMotionLess element, final int x, final int y) {
		this.elements[x][y] = element;
		return true;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#getElements()
	 */
	public IMotionLess[][] getElements(){
		return this.elements;		
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#getElement(int, int)
	 */
	public IMotionLess getElement(final int x, final int y) {
		return this.elements[x][y];
		
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#getHero()
	 */
	public IHero getHero(){
		return this.hero;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#setHero(contract.IHero)
	 */
	public void setHero(final IHero hero) {
		this.hero = hero;
		this.setChanged();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#getMobiles()
	 */
	public ArrayList<IMobile> getMobiles(){
		return this.mobiles;
	}

	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#play()
	 */
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
		

	
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#setMobilehasChanged()
	 */
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	/* (non-Javadoc)
	 * @see java.util.Observable#notifyObservers()
	 */
	public void notifyObservers(){
		super.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}




}
