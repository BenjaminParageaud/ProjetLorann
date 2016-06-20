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
 * The Class Moarcg.
 */
public class Moarcg extends Monster{
	
	/**
	 * Instantiates a new moarcg.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Moarcg(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_4.png"), Permeability.MONSTERABLE, 5, lorannWorldEntity, new MoarcgBehaviour());
	
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
