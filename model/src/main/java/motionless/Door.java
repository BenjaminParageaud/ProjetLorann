package motionless;

import java.util.Observable;
import java.util.Observer;

import contract.ISprite;
import contract.Permeability;
import element.Sprite;

public class Door extends MotionLess implements Observer {

	public boolean state;

	public Door(){
		super(new Sprite("gate_closed.png"), Permeability.MONSTERABLE, 7);

	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void update(Observable o, Object arg) {
		
		
	}




	// on doit faire un boolean qui recupere un etat pour ouvrir la porte
}
