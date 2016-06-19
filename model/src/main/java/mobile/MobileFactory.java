package mobile;

import contract.IHero;
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
	public static final Hero HERO = new Hero(lorannWorldEntity);
	
	private static IMobile mobile[] = {ARRBARR, CARGAV, KYRACJ, MOARCG};
	
	private static IHero hero[] = {HERO};
	
	
	public static IHero getFromBddIdHero(final int bddId, LorannWorldEntity lorannWorldEntity){
		for (final IHero hero : hero){
			if( 1 == bddId) {
				return hero;
			}
		}
		return null;
	}
	
	
	
	public static IMobile getFromBddId(final int bddId, LorannWorldEntity lorannWorldEntity){
		for (final IMobile mobile : mobile){
			if(mobile.getBddId() == bddId) {
				return mobile;
			}
		}
		return null;
	}
}
