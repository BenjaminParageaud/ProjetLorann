package motionless;

import java.util.Observable;
import java.util.Observer;

import contract.ISprite;
import contract.Permeability;
import element.Sprite;

public class Door extends MotionLess {
	
	//private final static FILE = new File("");

	public Door(){
		super(new Sprite("gate_closed.png"), Permeability.MONSTERABLE, 7);
	}

	/*public Door(boolean){
		super(new Sprite("gate_closed.png"), Permeability.MONSTERABLE, 7);

	}*/
}
