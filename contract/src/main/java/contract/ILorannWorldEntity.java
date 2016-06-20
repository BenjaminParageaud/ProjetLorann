package contract;

import java.util.ArrayList;
import java.util.Observable;



/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface ILorannWorldEntity {

	public void addElement(final IMotionLess element, final int x, final int y);

	public void addMobile(IMobile mobile, int x, int y);

	public void addHero(final IHero hero, final int x, final int y) ;
	
	public IHero getHero();
	
	public void setHero(final IHero hero) ;

	public boolean setElement( IMotionLess element, final int x, final int y);
	
	public void setElements(IMotionLess[][] elements);
	
	public IMotionLess[][] getElements();

	public IMotionLess getElement(final int x, final int y);
	
	public ArrayList<IMobile> getMobiles();

	public void setMobilehasChanged();
	
	public void notifyObservers();
	
	Observable getObservable();
	
	public void play();

	
}
