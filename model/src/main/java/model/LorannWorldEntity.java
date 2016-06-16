package model;

/**
 * The Class LorWorld.
 *
 * @author Clement Moreau
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

import element.Element;
import mobile.Hero;
import mobile.Mobile;


public class LorannWorldEntity extends Observable { 
	public Element	elements[][];
	public final ArrayList<Mobile>	mobiles;
	private DAOLorannWorld daoLorannWorld;
	private Hero	hero;
	private int		id;

	

	public LorannWorldEntity(final int id){
		this.mobiles = new ArrayList<Mobile>();
		daoLorannWorld.find(id);
	}
	
	public void addElement(final Element element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}

	public Element[][] getElement(){
		return this.elements;		
	}
	
	public Hero getHero(){
		return this.hero;
		
	}
	
	public ArrayList<Mobile> getMobiles(){
		return this.mobiles;
	}

	public void setHero(final Hero hero) {
		this.hero = hero;
		this.setChanged();
	}
	
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	public void notifyObservers(){
		super.notifyObservers();
	}
	
	public void addMobile(Mobile mobile, int x, int y){
		this.mobiles.add(mobile);
		mobile.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}
	
	@SuppressWarnings("unused")
	private void loadLorannWorld(){
		
	}	

	public int getId() {
		return this.id;
	}

	
	public void setId(final int id) {
		this.id = id;
	}

	
	

}
