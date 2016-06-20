package motionless;

import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Land.
 */
public class Land extends MotionLess {

	/**
	 * Instantiates a new land.
	 */
	public Land(){
		super(new Sprite("noir.jpg"), Permeability.PENETRABLE, 5);
	}
}
