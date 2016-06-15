package motionless;

import element.Permeability;
import element.Sprite;

public class Land extends MotionLess {

	public Land(){
		super(new Sprite("noir.jpg"), Permeability.PENETRABLE);
	}
}
