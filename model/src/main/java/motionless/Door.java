package motionless;

import element.Permeability;
import element.Sprite;

public class Door extends MotionLess {
	
	public Door(){
		super(new Sprite("gate_closed.png"), Permeability.MEETINGABLE, 7);
	}
	
	
	// on doit faire un boolean qui recupere un etat pour ouvrir la porte
}
