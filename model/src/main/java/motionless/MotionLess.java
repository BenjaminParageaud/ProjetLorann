/*
 * 
 */
package motionless;

import contract.IMotionLess;
import contract.ISprite;
import contract.Permeability;
import element.Element;


// TODO: Auto-generated Javadoc
/**
 * The Class MotionLess.
 */
public abstract class MotionLess extends Element implements IMotionLess{
	
	/** The bdd id. */
	private final int bddId;
	
	/**
	 * Instantiates a new motion less.
	 *
	 * @param sprite the sprite
	 * @param permeability the permeability
	 * @param bddId the bdd id
	 */
	public MotionLess(final ISprite sprite, final Permeability permeability, final int bddId){
		super(sprite,permeability);
		this.bddId = bddId;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionLess#getBddId()
	 */
	public int getBddId() {
		return bddId;
	}
}
