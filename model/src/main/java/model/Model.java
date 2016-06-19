package model;

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
		System.out.println("lololoolool");
		return lorannWorldEntity;
	}
}
