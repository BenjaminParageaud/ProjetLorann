package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public class Moarcg extends Monster{
	public Moarcg(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_4.png"), Permeability.MONSTERABLE, 5, lorannWorldEntity);
	
	}

	public boolean isMovePossible(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}
}
