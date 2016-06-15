package motionless;

import element.Permeability;
import element.Sprite;

public class CrystalBall extends MotionLess{

	public CrystalBall(){
		super(new Sprite("crystal_ball.png"), Permeability.MEETINGABLE);
	}
}
