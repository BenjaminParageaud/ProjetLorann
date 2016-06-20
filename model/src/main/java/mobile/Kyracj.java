package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;

public class Kyracj extends Monster{
	
	public Kyracj(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_1.png"), Permeability.MONSTERABLE, 4, lorannWorldEntity,new KyracjBehaviour());
	
	}


	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
