package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public class Cargav extends Monster{

	public Cargav(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_3.png"), Permeability.MONSTERABLE, 3, lorannWorldEntity);
	
	}
}
