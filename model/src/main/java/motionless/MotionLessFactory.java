package motionless;

import contract.IMotionLess;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating MotionLess objects.
 */
public abstract class MotionLessFactory {

	/** The Constant BONESH. */
	public static final MotionLess BONESH			= new BonesH();
	
	/** The Constant BONESV. */
	public static final MotionLess BONESV			= new BonesV();
	
	/** The Constant ROCK. */
	public static final MotionLess ROCK		    	= new Rock();
	
	/** The Constant CRYSTALBALL. */
	public static final MotionLess CRYSTALBALL		= new CrystalBall();
	
	/** The Constant DOOR. */
	public static final MotionLess DOOR				= new Door();
	
	/** The Constant LAND. */
	public static final MotionLess LAND				= new Land();
	
	/** The Constant PURSE. */
	public static final MotionLess PURSE			= new Purse();
	
	/** The motion less. */
	private static MotionLess		motionLess[]	= {	BONESH, BONESV, ROCK, CRYSTALBALL, DOOR, LAND, PURSE};
	
	/**
	 * Gets the from bdd id.
	 *
	 * @param bddId the bdd id
	 * @return the from bdd id
	 */
	public static IMotionLess getFromBddId(final int bddId){
		for (final MotionLess motionLess : motionLess){
			if(motionLess.getBddId() == bddId) {
				return motionLess;
			}
		}
		return null;
	}
}
