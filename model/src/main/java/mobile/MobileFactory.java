package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import model.LorannWorldEntity;
import motionless.MotionLess;

public class MobileFactory {

	public static ILorannWorldEntity lorannWorldEntity;
	
	public static final Mobile ARRBARR = new Arrbarr(lorannWorldEntity);
	public static final Mobile CARGAV = new Cargav(lorannWorldEntity);
	public static final Mobile KYRACJ = new Kyracj(lorannWorldEntity);
	public static final Mobile MOARCG = new Moarcg(lorannWorldEntity);
	public static final Mobile HERO = new Hero(lorannWorldEntity);
	
	private static Mobile mobile[] = {ARRBARR, CARGAV, KYRACJ, MOARCG, HERO};
	
	
	public static IMobile getFromBddId(final int bddId, LorannWorldEntity lorannWorldEntity){
		for (final Mobile mobile : mobile){
			if(mobile.getBddId() == bddId) {
				return mobile;
			}
		}
		return null;
	}
}
