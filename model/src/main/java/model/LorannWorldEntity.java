/*
 * 
 */
package model;

/**
 * The Class LorWorld.
 *
 * @author Clement Moreau
 */

import java.util.ArrayList;
import java.util.Observable;

import contract.IMobile;
import contract.IMonster;
import contract.IMotionLess;
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
	public ArrayList<IMonster>	monsterspell;

	public ArrayList<IMonster> getMonsterspell() {
		return monsterspell;
	}


	/** The hero. */
	private IHero	hero;

	/** The m. */
	private int Xdoor;
	private int Ydoor;

	private int alive = 0;

	private int saveX;
	private int saveY;

	private int c = 0;



	/**
	 * Instantiates a new lorann world entity.
	 */
	public LorannWorldEntity(){
		this.elements = new IMotionLess[40][40];
		this.mobiles = new ArrayList<IMobile>();
		this.monsters = new ArrayList<IMonster>();
		this.monsterspell = new ArrayList<IMonster>();

	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorldEntity#addElement(contract.IMotionLess, int, int)
	 */
	public void addElement(final IMotionLess element, final int x, final int y) {
		if(element == MotionLessFactory.getFromBddId(7)){
			setXdoor(x);
			setYdoor(y);
		}		
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
		setSaveX(x);
		setSaveY(y);
		hero.setX(x);
		hero.setY(y);
	}
	
	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public void shot(final int c){
		setC(c);
		if( getC() == 10){
			this.setChanged();
			this.notifyObservers();
		}
		
		
	}
	
	public void addSpell(IMonster monster, int x, int y){
		this.monsterspell.add(monster);
		//this.mobiles.add(monster);
		
		monster.setLorannWorldEntity(this, x, y);
		//mobile.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
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
	public void play() {
		while(alive == 0){
			this.setChanged();
			this.notifyObservers();
			try{
				Thread.sleep(350);
			} catch (final InterruptedException e){
				e.printStackTrace();
			}
			
					for (final IMonster monster : this.monsters){
						monster.getStrategy().animate(monster, this);	
						
					} 
			
		}
		getHero().setX(35);
		setMobilehasChanged();
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


	public int getXdoor() {
		return Xdoor;
	}


	public void setXdoor(int xdoor) {
		Xdoor = xdoor;
	}


	public int getYdoor() {
		return Ydoor;
	}


	public void setYdoor(int ydoor) {
		Ydoor = ydoor;
	}



	public int getAlive() {
		return alive;
	}


	public void setAlive(int alive) {
		this.alive = alive;
	}


	public int getSaveX() {
		return saveX;
	}


	public void setSaveX(int saveX) {
		this.saveX = saveX;
	}


	public int getSaveY() {
		return saveY;
	}


	public void setSaveY(int saveY) {
		this.saveY = saveY;
	}




}
