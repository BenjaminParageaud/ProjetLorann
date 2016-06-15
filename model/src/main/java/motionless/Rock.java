package motionless;

import element.Permeability;
import element.Sprite;

public class Rock extends MotionLess{

	public Rock(){
		super(new Sprite("bone.png"), Permeability.BLOCKING);
	}
}
