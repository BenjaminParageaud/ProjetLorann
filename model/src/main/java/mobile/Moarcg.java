package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.Permeability;
import element.Sprite;

public class Moarcg extends Monster{
	public Moarcg(ILorannWorldEntity lorannWorldEntity){
		
	super(new Sprite("monster_4.png"), Permeability.MONSTERABLE, 5, lorannWorldEntity, new MoarcgBehaviour());
	
	}

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		// TODO Auto-generated method stub
		
	}
}
