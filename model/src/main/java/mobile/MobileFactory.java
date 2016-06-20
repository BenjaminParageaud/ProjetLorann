package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import model.LorannWorldEntity;
import motionless.MotionLess;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Mobile objects.
 */
public class MobileFactory {

	/** The lorann world entity. */
	public static ILorannWorldEntity lorannWorldEntity;
	
	/** The Constant ARRBARR. */
	public static final Mobile ARRBARR = new Arrbarr(lorannWorldEntity);
	
	/** The Constant CARGAV. */
	public static final Mobile CARGAV = new Cargav(lorannWorldEntity);
	
	/** The Constant KYRACJ. */
	public static final Mobile KYRACJ = new Kyracj(lorannWorldEntity);
	
	/** The Constant MOARCG. */
	public static final Mobile MOARCG = new Moarcg(lorannWorldEntity);
	
	/** The mobile. */
	private static IMobile mobile[] = {ARRBARR, CARGAV, KYRACJ, MOARCG};
	
	
	
	/**
	 * Gets the from bdd id hero.
	 *
	 * @param bddId the bdd id
	 * @param lorannWorldEntity the lorann world entity
	 * @return the from bdd id hero
	 */
	public static IHero getFromBddIdHero(final int bddId, ILorannWorldEntity lorannWorldEntity){
		IHero hero = new Hero(lorannWorldEntity);
			if( 1 == bddId) {
				return hero;
			}
		return null;
	}
	
	
	
	/**
	 * Gets the from bdd id.
	 *
	 * @param bddId the bdd id
	 * @param lorannWorldEntity the lorann world entity
	 * @return the from bdd id
	 */
	public static IMobile getFromBddId(final int bddId, ILorannWorldEntity lorannWorldEntity){
		for (final IMobile mobile : mobile){
			if(mobile.getBddId() == bddId) {
				return mobile;
			}
		}
		return null;
	}
}
