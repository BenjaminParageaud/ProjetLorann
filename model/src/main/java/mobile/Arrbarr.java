package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public class Arrbarr extends Monster{
	public Arrbarr(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_2.png"), Permeability.MONSTERABLE, 2, lorannWorldEntity);
	
	}

	public boolean executeMoveIfPossible(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}
