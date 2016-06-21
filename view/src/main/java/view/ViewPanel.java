/*
 * 
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IElement;
import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMonster;


// TODO: Auto-generated Javadoc
/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {


	/** The view frame. */
	private ViewFrame	viewFrame;
	
	/** The mobiles. */
	private final ArrayList<? extends IMobile> mobiles;
	private final ArrayList< ? extends IMonster>	monsterspell;
	
	private final ILorannWorldEntity lorannWorldEntity;
	
	/** The elements. */
	private final IElement elements[][];

	/** The hero. */
	private IHero hero;

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;


	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame the view frame
	 * @param mobiles the mobiles
	 * @param elements the elements
	 * @param hero the hero
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<IMobile> mobiles, final IElement elements[][] , final IHero hero, final ArrayList<IMonster>	monsterspell,final ILorannWorldEntity lorannnWorldEntity){
		this.setViewFrame(viewFrame);
		this.mobiles = mobiles;
		this.monsterspell = monsterspell;
		this.elements = elements;
		this.lorannWorldEntity = lorannnWorldEntity;
		this.hero = hero;
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame 
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}
	
	/**
	 * Gets the mobiles.
	 *
	 * @return the mobiles
	 */
	public ArrayList<? extends IMobile> getMobiles() {
		return mobiles;
	}

	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public IElement[][] getElements() {
		return elements;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	//@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		
		for(int y = 0; y < 12;y++){
			for(int x = 0; x < 20; x++){
				if(this.elements[x][y] != null){
					graphics.drawImage(this.elements[x][y].getSprite().getImage(), x*32, y*32,null);
				} else {
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		if(lorannWorldEntity.getC() == 10){
			for( final IMonster monsterspell : this.monsterspell){
				graphics.drawImage(monsterspell.getSprite().getImage(),monsterspell.getLorannWorldEntity().getHero().getX()*32 , monsterspell.getLorannWorldEntity().getHero().getX()*32 , null);
			}
			
		}
		for( final IMobile mobile : this.mobiles){
		graphics.drawImage(mobile.getSprite().getImage(),mobile.getX()*32 , mobile.getY()*32 , null);
		
		}		
		graphics.drawImage(this.hero.getSprite().getImage(),this.hero.getX()*32 , this.hero.getY()*32 , null);
	}
}
