/*
 * 
 */
package model;

import java.util.Observable;

import contract.ILorannWorldEntity;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model implements IModel{

	/** The dao lorann world. */
	final DAOLorannWorld daoLorannWorld;
	
	/** The lorann world entity. */
	private final ILorannWorldEntity lorannWorldEntity;

	/**
	 * Instantiates a new model.
	 *
	 * @throws Exception the exception
	 */
	public Model() throws Exception{
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorldEntity = this.daoLorannWorld.find(2);
		


	}

	/* (non-Javadoc)
	 * @see contract.IModel#getLorannWorldEntity()
	 */
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.lorannWorldEntity.getObservable();
	}
}
