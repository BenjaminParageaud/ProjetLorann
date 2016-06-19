package mobile;

import contract.ILorannWorldEntity;
import contract.Permeability;
import element.Sprite;

public abstract class Monster extends Mobile implements IMonster{

	public Monster(final Sprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity ){

		super(sprite, permeability, bddId, lorannWorldEntity);

	}
}