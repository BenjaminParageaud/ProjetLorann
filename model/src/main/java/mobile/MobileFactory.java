/*
 * 
 */
package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMonster;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Mobile objects.
 */
public class MobileFactory {

	/** The lorann world entity. */
	public static ILorannWorldEntity lorannWorldEntity;
	
	/** The Constant ARRBARR. */
	public static final Monster ARRBARR = new Arrbarr(lorannWorldEntity);
	
	/** The Constant CARGAV. */
	public static final Monster CARGAV = new Cargav(lorannWorldEntity);
	
	/** The Constant KYRACJ. */
	public static final Monster KYRACJ = new Kyracj(lorannWorldEntity);
	
	/** The Constant MOARCG. */
	public static final Monster MOARCG = new Moarcg(lorannWorldEntity);
	
	/** The Constant SPELL. */
	public static final Monster SPELL =  new Spell(lorannWorldEntity);
	
	/** The monster. */
	private static IMonster monster[] = {ARRBARR, CARGAV, KYRACJ, MOARCG, SPELL};
	
	
	
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
	public static IMonster getFromBddId(final int bddId, ILorannWorldEntity lorannWorldEntity){
		for (final IMonster monster : monster){
			if(monster.getBddId() == bddId) {
				return monster;
			}
		}
		return null;
	}
}
