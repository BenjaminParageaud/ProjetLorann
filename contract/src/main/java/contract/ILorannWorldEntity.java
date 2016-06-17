package contract;

import java.util.ArrayList;
import java.util.Observable;




/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface ILorannWorldEntity {

	public void addElement(final IElement element, final int x, final int y);

	public void addMobile(IMobile mobile, int x, int y);

	public void loadMap(int id);
	
	public void setElements(IElement[][] elements);
	
	public IElement[][] getElements();

	public IElement getElement(final int x, final int y);
	
	public ArrayList<IMobile> getMobiles();

	public void setMobilehasChanged();
	
	public void notifyObservers();
	
	Observable getObservable();
	
}
