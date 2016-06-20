/*
 * 
 */
package motionless;

import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Rock.
 */
public class Rock extends MotionLess{

	/**
	 * Instantiates a new rock.
	 */
	public Rock(){
		super(new Sprite("bone.png"), Permeability.BLOCKING, 2);
	}
}
