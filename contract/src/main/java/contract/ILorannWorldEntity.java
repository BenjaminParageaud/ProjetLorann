/*
 * 
 */
package contract;

import java.util.ArrayList;
import java.util.Observable;



// TODO: Auto-generated Javadoc
/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface ILorannWorldEntity {

	/**
	 * Adds the element.
	 *
	 * @param element the element
	 * @param x the x
	 * @param y the y
	 */
	public void addElement(final IMotionLess element, final int x, final int y);

	/**
	 * Adds the monster.
	 *
	 * @param monster the monster
	 * @param x the x
	 * @param y the y
	 */
	public void addMonster(IMonster monster, int x, int y);

	/**
	 * Adds the hero.
	 *
	 * @param hero the hero
	 * @param x the x
	 * @param y the y
	 */
	public void addHero(final IHero hero, final int x, final int y) ;
	
	/**
	 * Gets the hero.
	 *
	 * @return the hero
	 */
	public IHero getHero();
	
	/**
	 * Sets the hero.
	 *
	 * @param hero the new hero
	 */
	public void setHero(final IHero hero) ;

	/**
	 * Sets the element.
	 *
	 * @param element the element
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	public boolean setElement( IMotionLess element, final int x, final int y);
	
	/**
	 * Sets the elements.
	 *
	 * @param elements the new elements
	 */
	public void setElements(IMotionLess[][] elements);
	
	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public IMotionLess[][] getElements();

	/**
	 * Gets the element.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the element
	 */
	public IMotionLess getElement(final int x, final int y);
	
	/**
	 * Gets the mobiles.
	 *
	 * @return the mobiles
	 */
	public ArrayList<IMobile> getMobiles();
	
	/**
	 * Gets the xdoor.
	 *
	 * @return the xdoor
	 */
	public int getXdoor();

	/**
	 * Sets the xdoor.
	 *
	 * @param xdoor the new xdoor
	 */
	public void setXdoor(int xdoor);

	/**
	 * Gets the ydoor.
	 *
	 * @return the ydoor
	 */
	public int getYdoor();

	/**
	 * Sets the ydoor.
	 *
	 * @param ydoor the new ydoor
	 */
	public void setYdoor(int ydoor);

	/**
	 * Sets the mobilehas changed.
	 */
	public void setMobilehasChanged();
	
	/**
	 * Notify observers.
	 */
	public void notifyObservers();
	
	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	/**
	 * Play.
	 */
	public void play();

	
}