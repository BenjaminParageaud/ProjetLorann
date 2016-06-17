package mobile;

import element.Permeability;
import element.Sprite;

public abstract class Monster extends Mobile implements IMonster{

	public Monster(final Sprite sprite, final Permeability permeability){

		super(sprite, permeability);

	}
}