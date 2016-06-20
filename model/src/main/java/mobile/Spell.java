package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Spell.
 */
public class Spell extends Mobile{
	
	/**
	 * Instantiates a new spell.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 1, lorannWorldEntity);
	}

	
	/// connection avec le pressage de la barre espace
}

