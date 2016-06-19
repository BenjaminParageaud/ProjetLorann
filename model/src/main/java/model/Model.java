package model;

import contract.ILorannWorldEntity;
import contract.IModel;

public class Model implements IModel{

	final DAOLorannWorld daoLorannWorld;
	private final ILorannWorldEntity lorannWorldEntity;

	public Model() throws Exception{
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorldEntity = this.daoLorannWorld.find(1);
		


	}

	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}
}
