/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;


// TODO: Auto-generated Javadoc
/**
 * The Class Arrbarr.
 */
public class Arrbarr extends Monster{
	
	/**
	 * Instantiates a new arrbarr.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Arrbarr(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_2.png"), Permeability.MONSTERABLE, 2, lorannWorldEntity,new ArrbarrBehaviour());
	
	}
	
	

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
