package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Kyracj.
 */
public class Kyracj extends Monster{
	
	/**
	 * Instantiates a new kyracj.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Kyracj(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_1.png"), Permeability.MONSTERABLE, 4, lorannWorldEntity);
	
	}
}
