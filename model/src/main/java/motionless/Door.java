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
public class Door extends MotionLess implements Observer {

	/** The state. */
	public boolean state;

	/**
	 * Instantiates a new door.
	 */
	public Door(){
		super(new Sprite("gate_closed.png"), Permeability.MONSTERABLE, 7);

	}

	/**
	 * Checks if is state.
	 *
	 * @return true, if is state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		
		
	}




	// on doit faire un boolean qui recupere un etat pour ouvrir la porte
}
