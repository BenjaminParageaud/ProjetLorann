package motionless;

import java.util.Observable;
import java.util.Observer;

import contract.ISprite;
import contract.Permeability;
import element.Sprite;

public class Door extends MotionLess {
	
	private static ISprite DOOROPEN = new Sprite("gate_open.png");
	private static ISprite DOORCLOSED = new Sprite("gate_closed.png");
	private static Permeability PERMEABILITY = Permeability.MONSTERABLE;
	//private File DOOR = DOORCLOSED;
	private static boolean isDoorOpen;

	public Door(){
		super(DOORCLOSED, PERMEABILITY, 7);
	}

	public Door(boolean open){
		super(DOOROPEN, PERMEABILITY, 8);
	}
}