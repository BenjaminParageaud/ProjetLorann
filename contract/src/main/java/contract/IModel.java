package contract;

import java.util.ArrayList;
import java.util.Observable;

import element.Element;
import mobile.Mobile;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	 void loadMap(int id);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	Element[][] getElements();

	void setElements(Element[][] elements);
	


	 ArrayList<Mobile> getMobiles;
		

	 void setMobiles(ArrayList<Mobile> mobiles);

	
	public void setMobilehasChanged();
	
	
	public void notifyObservers();
	
}
