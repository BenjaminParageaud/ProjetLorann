/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class ArrbarrBehaviour.
 */
public class ArrbarrBehaviour implements IStrategy{

	/**
	 * Instantiates a new arrbarr behaviour.
	 */
	public ArrbarrBehaviour(){
		
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		monster.moveUp();
	}
}
