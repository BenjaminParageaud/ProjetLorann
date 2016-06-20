package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;

public class Cargav extends Monster{

	public Cargav(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_3.png"), Permeability.MONSTERABLE, 3, lorannWorldEntity, new CargavBehaviour());
	
	}


	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
