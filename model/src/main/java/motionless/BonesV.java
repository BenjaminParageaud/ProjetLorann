package motionless;

import contract.Permeability;
import element.Sprite;

public class BonesV extends MotionLess{

	
	public BonesV(){
		super(new Sprite("vertical_bone.png"), Permeability.BLOCKING, 4);
	}
}
