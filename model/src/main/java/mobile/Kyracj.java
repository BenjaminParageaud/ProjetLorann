package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public class Kyracj extends Monster{
	
	public Kyracj(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_1.png"), Permeability.MONSTERABLE, 4, lorannWorldEntity);
	
	}
}
