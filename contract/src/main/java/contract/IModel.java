package contract;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import element.Element;
import mobile.Mobile;
import model.DAOLorannWorld;
import model.DBConnection;



/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {



	public void addElement(final Element element, final int x, final int y);


	public void addMobile(Mobile mobile, int x, int y);

	public void loadMap(int id);
	
	public void setElements(Element[][] elements);
	
	public Element[][] getElements();

	public Element getElement(final int x, final int y);
	

	public ArrayList<Mobile> getMobiles();

	public void setMobilehasChanged();
	

	public void notifyObservers();
	
	Observable getObservable();
	
}
