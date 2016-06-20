package motionless;

import contract.IMotionLess;

public abstract class MotionLessFactory {

	public static final MotionLess BONESH			= new BonesH();
	public static final MotionLess BONESV			= new BonesV();
	public static final MotionLess ROCK		    	= new Rock();
	public static final MotionLess CRYSTALBALL		= new CrystalBall();
	public static final MotionLess DOORCLOSED		= new Door();
	public static final MotionLess DOOROPEN			= new Door(false);
	public static final MotionLess LAND				= new Land();
	public static final MotionLess PURSE			= new Purse();

	private static MotionLess		motionLess[]	= {	BONESH, BONESV, ROCK, CRYSTALBALL, DOOROPEN, DOORCLOSED, LAND, PURSE};

	public static IMotionLess getFromBddId(final int bddId){
		for (final MotionLess motionLess : motionLess){
			if(motionLess.getBddId() == bddId) {
				return motionLess;
			}
		}
		return null;
	}
}
