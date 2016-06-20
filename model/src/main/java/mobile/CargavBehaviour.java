package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;

public class CargavBehaviour implements IStrategy{

	public CargavBehaviour(){
		
	}

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		monster.moveUp();
	}
}
