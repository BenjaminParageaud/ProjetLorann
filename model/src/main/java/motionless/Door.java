/*
 * 
 */
package motionless;

import java.util.Observable;
import java.util.Observer;

import contract.ISprite;
import contract.Permeability;
import element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Door.
 */
public class Door extends MotionLess {
	
	/** The dooropen. */
	private static ISprite DOOROPEN = new Sprite("gate_open.png");
	
	/** The doorclosed. */
	private static ISprite DOORCLOSED = new Sprite("gate_closed.png");
	
	/** The permeability. */
	private static Permeability PERMEABILITY = Permeability.MONSTERABLE;
	
	/** The is door open. */
	//private File DOOR = DOORCLOSED;
	private static boolean isDoorOpen;

	/**
	 * Instantiates a new door.
	 */
	public Door(){
		super(DOORCLOSED, PERMEABILITY, 7);
	}

	/**
	 * Instantiates a new door.
	 *
	 * @param open the open
	 */
	public Door(boolean open){
		super(DOOROPEN, PERMEABILITY, 8);
	}
}