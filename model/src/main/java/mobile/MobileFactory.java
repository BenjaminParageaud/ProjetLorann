package mobile;

import contract.IMobile;
import motionless.MotionLess;

public class MobileFactory {

	public static final Mobile ARRBARR = new Arrbarr();
	public static final Mobile CARGAV = new Cargav();
	public static final Mobile KYRACJ = new Kyracj();
	public static final Mobile MOARCG = new Moarcg();
	public static final Mobile HERO = new Hero();
	
	private static Mobile mobile[] = {ARRBARR, CARGAV, KYRACJ, MOARCG, HERO};
	
	
	public static IMobile getFromBddId(final int bddId){
		for (final Mobile mobile : mobile){
			if(mobile.getBddId() == bddId) {
				return mobile;
			}
		}
		return null;
	}
}
