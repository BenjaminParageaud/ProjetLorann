package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.Permeability;
import element.Sprite;

public class Spell extends Mobile implements ISpell{
	
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 1, lorannWorldEntity);
	}

	public ISpell AffichageSpell(final int x, final int y){
			return null;
	}

	public Boolean executeMoveIfPossible(final int x, final int y){
		boolean a = false;
		if (this.getLorannWorldEntity().getElement(x, y)==null)
		{
			a = true;
		} else {
			a = false;
		}
		return a;
	}
/*
		for(final IMobile I : this.getLorannWorldEntity().getMotionElements())
		{
			if((I.getX() == x) && (I.getY() == y) && (I != this) && ((I.getSymbole() == 't') || (I.getSymbole() == 'k') || (I.getSymbole() == 'd')))
			{
				a = false;
			}
		}
		if(a) {
			return a;
		}
		this.setX(this.getX());
		this.setY(this.getY());
		return a;
	}
	/// connection avec le pressage de la barre espace
	 * */

}
