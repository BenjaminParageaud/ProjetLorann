package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IModel;
import element.Element;
import mobile.Hero;
import mobile.Mobile;
import motionless.MotionLessFactory;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {


	public Element	elements[][];
	public ArrayList<Mobile>	mobiles; 

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.elements;
		this.mobiles;
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
	}


	public ArrayList<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(ArrayList<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
/*
	public void loadMessage(final String key) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setMessage(daoHelloWorld.find(key).getMessage());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	public void notifyObservers(){
		super.notifyObservers();
	}
	
}
