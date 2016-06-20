package motionless;

import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class CrystalBall.
 */
public class CrystalBall extends MotionLess{

	/**
	 * Instantiates a new crystal ball.
	 */
	public CrystalBall(){
		super(new Sprite("crystal_ball.png"), Permeability.MEETINGABLE, 1);
	}
}
