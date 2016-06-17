package model;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IModel;
import element.Element;
import mobile.Mobile;


/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {


	private Element	elements[][];
	private ArrayList<Mobile>	mobiles; 

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.getElements();
		this.getMobiles();
	}


	public Observable getObservable() {
		return this;
	}

	public void loadMap(int id) {
		try{
			final DAOLorannWorld daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
			this.setElements(daoLorannWorld.findMotionLess(id).getElements());
			this.setMobiles(daoLorannWorld.findMotion(id).getMobiles());
		} catch (final SQLException e){
			e.printStackTrace();
		}
	}


	public Element[][] getElements() {
		return elements;
	}

	public void setElements(Element[][] elements) {
		this.elements = elements;
		this.setChanged();
		this.notifyObservers();
	}


	public ArrayList<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(ArrayList<Mobile> mobiles) {
		this.mobiles = mobiles;
		this.setChanged();
		this.notifyObservers();
	}

	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	public void notifyObservers(){
		super.notifyObservers();
	}
	
}
