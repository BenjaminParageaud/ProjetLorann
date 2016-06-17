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
import contract.ILorannWorldEntity;
import mobile.Hero;



public class LorannWorldEntity extends Observable implements ILorannWorldEntity{ 
	public IElement	elements[][];
	public ArrayList<IMobile>	mobiles;
	private Hero	hero;
	//private int		id;



	public LorannWorldEntity(){
		this.mobiles = new ArrayList<IMobile>();	
	}

	public void addElement(final IElement element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}


	public void addMobile(IMobile mobile, int x, int y){
		this.mobiles.add(mobile);
		hero.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	public void loadMap(int id) {
		try{
			final DAOLorannWorld daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
			daoLorannWorld.findMotionLess(id);
			daoLorannWorld.findMotion(id);
		} catch (final SQLException e){
			e.printStackTrace();
		}
	}
	
	
	/*public void addMobile(final Hero hero, final int x, final int y) {
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}*/

	public void setElements(IElement[][] elements) {
		this.elements = elements;
	}

	public IElement[][] getElements(){
		return this.elements;		
	}

	public IElement getElement(final int x, final int y) {
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
