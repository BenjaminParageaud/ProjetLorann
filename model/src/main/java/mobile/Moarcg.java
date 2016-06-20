package mobile;

import contract.ILorannWorldEntity;
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
		
	super(new Sprite("monster_4.png"), Permeability.MONSTERABLE, 5, lorannWorldEntity);
	
	}
}
