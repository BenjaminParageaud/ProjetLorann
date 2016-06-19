package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public class Spell extends Mobile{
	
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 1, lorannWorldEntity);
	}

	
	/// connection avec le pressage de la barre espace
}

