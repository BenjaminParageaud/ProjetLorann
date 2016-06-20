package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.ISprite;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLessFactory;

public class Spell extends Mobile implements ISpell{
	public int coordonate;
	private ISprite sprite; 
	private Permeability permeability;
	
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 1, lorannWorldEntity);
	}

	public ISpell AffichageSpell(final int x, final int y){
	   
			return null;
	}
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}
	
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
	public boolean isMovePossible(final int x, final int y){
		if(getLorannWorldEntity().getElement(x, y) == null){
			return(MobileFactory.getFromBddIdHero(1, lorannWorldEntity).getPermeability() == (Permeability.SPELLABLE)); 
		}
		else {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			return(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)|| MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )); 
		}
	}

	public Boolean executeMoveIfPossible(final int x, final int y){
		boolean a = false;
		if (this.getLorannWorldEntity().getElement(x, y)== null)
		{
			a = true;
		} else {
			a = false;
		}
		return a;
	}
	
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
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
