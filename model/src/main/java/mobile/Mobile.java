package mobile;

import element.Permeability;
import element.Sprite;
import model.LorannWorldEntity;
import element.Element;


public abstract class Mobile extends Element {
	
	private final int bddId;
	

	public Mobile(final Sprite sprite, final Permeability permeability, final int bddId){
	    super(sprite, permeability);
	    this.bddId = bddId;
	}

	public int getBddId() {
		return bddId;
	}
	
}