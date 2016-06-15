package motionless;

public abstract class MotionLessFactory {

	public static final MotionLess BONESH			= new BonesH();
	public static final MotionLess BONESV			= new BonesV();
	public static final MotionLess ROCK		    	= new Rock();
	public static final MotionLess CRYSTALBALL		= new CrystalBall();
	public static final MotionLess DOOR				= new Door();
	public static final MotionLess LAND				= new Land();
	public static final MotionLess PURSE			= new Purse();
	
	private static MotionLess		motionLess[]	= {	BONESH, BONESV, ROCK, CRYSTALBALL, DOOR, LAND, PURSE};
	
	public static MotionLess getFromBddId(final int bddId){
		for (final MotionLess motionLess : motionLess){
			if(motionLess.getBddId() == bddId) {
				
			}
		}
		return LAND;
	}
	
}
