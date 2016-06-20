package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Cargav.
 */
public class Cargav extends Monster{

	/**
	 * Instantiates a new cargav.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Cargav(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_3.png"), Permeability.MONSTERABLE, 3, lorannWorldEntity);
	
	}
}
