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
	private int i = 0;
	
	public Spell(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("SpellAnim.gif"), Permeability.SPELLABLE, 1, lorannWorldEntity);
		this.sprite = new Sprite("SpellAnim.gif");
		setLorannWorldEntity(lorannWorldEntity);
		setPermeability(Permeability.SPELLABLE);
	}

	public ISpell AffichageSpell(final int x, final int y){
		
	   while(i<1){
		   
	   }
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
			return(MobileFactory.getSpellBdd(1, lorannWorldEntity).getPermeability() == (Permeability.SPELLABLE)); 
		}
		else {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			return(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)|| MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )); 
		}
	}
	
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
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
*/
}
}
