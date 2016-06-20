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
import contract.IMotionLess;
import element.Element;
import motionless.MotionLessFactory;
import contract.IHero;
import contract.ILorannWorldEntity;




public class LorannWorldEntity extends Observable implements ILorannWorldEntity{ 
	public IMotionLess	elements[][];
	public ArrayList<IMobile>	mobiles;
	private IHero	hero;
	public int Xdoor;
	public int Ydoor;


	public LorannWorldEntity(){
		this.elements = new IMotionLess[40][40];
		this.mobiles = new ArrayList<IMobile>();
		
	}
	
	
	public void addElement(final IMotionLess element, final int x, final int y) {
		if(element == MotionLessFactory.getFromBddId(7)){
			setXdoor(x);
			setYdoor(y);
			System.out.println("XXXXXX");
			System.out.println(getXdoor());
			System.out.println("YYYYYY");
			System.out.println(getYdoor());
		}
		/*System.out.println(element);
			
			System.out.println("XXXXXX");
			System.out.println(getXdoor());
			System.out.println("YYYYYY");
			System.out.println(getYdoor());*/
		
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}


	public void addMobile(IMobile mobile, int x, int y){
		this.mobiles.add(mobile);
		mobile.setLorannWorldEntity(this, x, y);
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
	
	public void play(){
		for(;;){
			this.setChanged();
			this.notifyObservers();
			/*try{
				Thread.sleep(125);
			} catch (final InterruptedException e){
				e.printStackTrace();
			}
			
			//for (final IMobile mobile : this.mobiles){
				
			//}*/
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
