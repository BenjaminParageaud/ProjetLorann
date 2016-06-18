package motionless;

import contract.IMotionLess;
import contract.ISprite;
import contract.Permeability;
import element.Element;
import element.Sprite;


public abstract class MotionLess extends Element implements IMotionLess{
	
	private final int bddId;
	
	public MotionLess(final ISprite sprite, final Permeability permeability, final int bddId){
		super(sprite,permeability);
		this.bddId = bddId;
	}

	public int getBddId() {
		return bddId;
	}
}
