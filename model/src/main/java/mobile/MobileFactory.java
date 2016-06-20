package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;
import model.LorannWorldEntity;
import motionless.MotionLess;

public class MobileFactory {

	public static ILorannWorldEntity lorannWorldEntity;
	
	public static final Monster ARRBARR = new Arrbarr(lorannWorldEntity);
	public static final Monster CARGAV = new Cargav(lorannWorldEntity);
	public static final Monster KYRACJ = new Kyracj(lorannWorldEntity);
	public static final Monster MOARCG = new Moarcg(lorannWorldEntity);
	
	private static IMonster monster[] = {ARRBARR, CARGAV, KYRACJ, MOARCG};
	
	
	
	public static IHero getFromBddIdHero(final int bddId, ILorannWorldEntity lorannWorldEntity){
		IHero hero = new Hero(lorannWorldEntity);
			if( 1 == bddId) {
				return hero;
			}
		return null;
	}
	
	
	
	public static IMonster getFromBddId(final int bddId, ILorannWorldEntity lorannWorldEntity){
		for (final IMonster monster : monster){
			if(monster.getBddId() == bddId) {
				return monster;
			}
		}
		return null;
	}
}
