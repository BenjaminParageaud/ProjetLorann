package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;

public class ArrbarrBehaviour implements IStrategy{

	public ArrbarrBehaviour(){
		
	}

	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		monster.moveUp();
	}
}
