package mobile;

import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	private final int bddId;
	

	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId){
	    super(sprite, permeability);
	    this.bddId = bddId;
	}

	public int getBddId() {
		return bddId;
	}
	
}