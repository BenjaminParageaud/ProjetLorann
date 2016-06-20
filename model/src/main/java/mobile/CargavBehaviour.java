/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;
import model.LorannWorldEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class CargavBehaviour.
 */
public class CargavBehaviour implements IStrategy{

	
	private ILorannWorldEntity lorannWorldEntity;
	/**
	 * Instantiates a new cargav behaviour.
	 */
	public CargavBehaviour(){
		
	}

	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		
	
	//int PosXDoor = getLorannWorldEntity.getXDoor();
		
		
	}
}
