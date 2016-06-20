/*
 * 
 */
package motionless;

import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Purse.
 */
public class Purse extends MotionLess{

	/**
	 * Instantiates a new purse.
	 */
	public Purse(){
		super(new Sprite("purse.png"), Permeability.MEETINGABLE, 6);
	}
}
