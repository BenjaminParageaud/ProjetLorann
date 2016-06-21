/*
 * 
 */
package mobile;

import contract.ILorannWorldEntity;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Spell.
 */
public class Spell extends Monster{
	
	/**
	 * Instantiates a new spell.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 9, lorannWorldEntity, new SpellBehaviour());
	}

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}

	
	/// connection avec le pressage de la barre espace
}

