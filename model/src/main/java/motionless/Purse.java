package motionless;

import contract.Permeability;
import element.Sprite;

public class Purse extends MotionLess{

	public Purse(){
		super(new Sprite("purse.png"), Permeability.MEETINGABLE, 6);
	}
}
