package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;


public class Arrbarr extends Monster{
	public Arrbarr(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_2.png"), Permeability.MONSTERABLE, 2, lorannWorldEntity,new ArrbarrBehaviour());
	
	}
	
	

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
