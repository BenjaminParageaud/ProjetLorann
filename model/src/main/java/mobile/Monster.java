package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public abstract class Monster extends Mobile implements IMonster{

	/**
	 * Instantiates a new monster.
	 *
	 * @param sprite the sprite
	 * @param permeability the permeability
	 * @param bddId the bdd id
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Monster(final Sprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity ){

		super(sprite, permeability, bddId, lorannWorldEntity);

	}
}