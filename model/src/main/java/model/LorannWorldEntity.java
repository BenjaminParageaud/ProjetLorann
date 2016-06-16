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
		daoLorannWorld.findMotionLess(id);
		daoLorannWorld.findMotion(id);
	}

	public void addElement(final Element element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannWorldEntity(this);
		}
		this.setChanged();
	}


	public void addMobile(Mobile mobile, int x, int y){
		this.mobiles.add(mobile);
		hero.setLorannWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	public void addMobile(final Hero hero, final int x, final int y) {
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}

	public void setElements(Element[][] elements) {
		this.elements = elements;
	}

	public Element[][] getElements(){
		return this.elements;		
	}

	public Element getElement(final int x, final int y) {
		return this.elements[x][y];
	}
	
	public Hero getHero(){
		return this.hero;

	}
	public void setHero(final Hero hero) {
		this.hero = hero;
		this.setChanged();
	}

	public ArrayList<Mobile> getMobiles(){
		return this.mobiles;
	}


	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}

	public void notifyObservers(){
		super.notifyObservers();
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
