/*
 * 
 */
package mobile;

import java.util.Random;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class MoarcgBehaviour.
 */
public class MoarcgBehaviour implements IStrategy{

	/**
	 * Instantiates a new moarcg behaviour.
	 */
	public MoarcgBehaviour(){
		
	}

	/* (non-Javadoc)
	 * @see contract.IStrategy#animate(contract.IMonster, contract.ILorannWorldEntity)
	 */
	public void animate(IMonster monster, ILorannWorldEntity lorannWorldEntity) {
		
		Random rand = new Random();
		int Nomber = rand.nextInt(8);
		
		switch (Nomber) {
		case 1:
			monster.moveUp();
			break;
		case 2:
			monster.moveDown();
			break;
		case 3:
			monster.moveLeft();
			break;
		case 4:
			monster.moveRight();
			break;
		case 5:
			monster.moveUpLeft();
			break;
		case 6:
			monster.moveUpRight();
			break;
		case 7:
			monster.moveDownLeft();
			break;
		case 8:
			monster.moveDownRight();
			break;
		default:
			break;
		}
	}

}
