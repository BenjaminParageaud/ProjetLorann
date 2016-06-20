package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import model.LorannWorldEntity;
import motionless.MotionLess;

public class MobileFactory {

	public static ILorannWorldEntity lorannWorldEntity;
	
	public static final Mobile ARRBARR = new Arrbarr(lorannWorldEntity);
	public static final Mobile CARGAV = new Cargav(lorannWorldEntity);
	public static final Mobile KYRACJ = new Kyracj(lorannWorldEntity);
	public static final Mobile MOARCG = new Moarcg(lorannWorldEntity);
	
	private static IMobile mobile[] = {ARRBARR, CARGAV, KYRACJ, MOARCG};
	
	
	
	public static IHero getFromBddIdHero(final int bddId, ILorannWorldEntity lorannWorldEntity){
		IHero hero = new Hero(lorannWorldEntity);
			if( 1 == bddId) {
				return hero;
			}
		return null;
	}
	
	public static ISpell getSpellBdd(final int bddId, ILorannWorldEntity lorannwWorldEntity){
		ISpell spell = new Spell(lorannWorldEntity);
		if( 1 == bddId) {
			return spell;
		}
	return null;
	}
	
	public static IMobile getFromBddId(final int bddId, ILorannWorldEntity lorannWorldEntity){
		for (final IMobile mobile : mobile){
			if(mobile.getBddId() == bddId) {
				return mobile;
			}
		}
		return null;
	}
}
