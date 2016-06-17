package motionless;

import element.Permeability;
import element.Sprite;

public class Purse extends MotionLess{

	public Purse(){
		super(new Sprite("purse.png"), Permeability.MEETINGABLE, 6);
	}
}
