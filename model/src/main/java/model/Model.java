package model;

import java.util.Observable;

import contract.ILorannWorldEntity;
import contract.IModel;

public class Model implements IModel{

	final DAOLorannWorld daoLorannWorld;
	private final ILorannWorldEntity lorannWorldEntity;

	public Model() throws Exception{
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorldEntity = this.daoLorannWorld.find(3);
		


	}

	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}
	
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.lorannWorldEntity.getObservable();
	}
}
