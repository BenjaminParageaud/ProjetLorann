package motionless;

import contract.Permeability;
import element.Sprite;

public class BonesH extends MotionLess {

	public BonesH(){
		super(new Sprite("horizontal_bone.png"), Permeability.BLOCKING, 3);
	}
}
