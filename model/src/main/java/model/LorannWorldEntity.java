package model;

/**
 * The Class LorWorld.
 *
 * @author Clement Moreau
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.IMobile;
import contract.IMotionLess;
import element.Element;
import contract.ILorannWorldEntity;
import mobile.Hero;
import mobile.MobileFactory;



public class LorannWorldEntity extends Observable implements ILorannWorldEntity{ 
	public IMotionLess	elements[][];
	public ArrayList<IMobile>	mobiles;
	private Hero	hero;
	//private int		id;



	public LorannWorldEntity(){
		this.elements = new IMotionLess[32][32];
		//this.tests = new IElement[10][10];
		this.mobiles = new ArrayList<IMobile>();
		//addElements(MobileFactory.getFromBddId(5),1,1);
		
		
	}
	
	
	public void addElement(final IMotionLess element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}


	public void addMobile(IMobile mobile, int x, int y){
		this.mobiles.add(mobile);
		//hero.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	public void loadMap(int id) {
		try{
			final DAOLorannWorld daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
			daoLorannWorld.findMotionLess(id);
			System.out.println(elements[4][3]);
			daoLorannWorld.findMotion(id);
		} catch (final SQLException e){
			e.printStackTrace();
		}
	}
	
	
	/*public void addMobile(final Hero hero, final int x, final int y) {
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}*/

	public void setElements(IMotionLess[][] elements) {
		this.elements = elements;
	}

	public IMotionLess[][] getElements(){
		return this.elements;		
	}

	public IMotionLess getElement(final int x, final int y) {
		return this.elements[x][y];
	}
	
	/*public Hero getHero(){
		return this.hero;

	}
	public void setHero(final Hero hero) {
		this.hero = hero;
		this.setChanged();
	}*/

	public ArrayList<IMobile> getMobiles(){
		return this.mobiles;
	}

	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	public void notifyObservers(){
		super.notifyObservers();
	}

	public Observable getObservable() {
		return null;
	}

}
