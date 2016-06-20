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


/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {


	private ViewFrame	viewFrame;
	
	private final ArrayList<? extends IMobile> mobiles;
	
	private final IElement elements[][];

	private IHero hero;

	private static final long	serialVersionUID	= -998294702363713521L;


	public ViewPanel(final ViewFrame viewFrame, final ArrayList<IMobile> mobiles, final IElement elements[][] , final IHero hero){
		this.setViewFrame(viewFrame);
		this.mobiles = mobiles;
		this.elements = elements;
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
	
	public ArrayList<? extends IMobile> getMobiles() {
		return mobiles;
	}

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
		
		for( final IMobile mobile : this.mobiles){
		graphics.drawImage(mobile.getSprite().getImage(),mobile.getX()*32 , mobile.getY()*32 , null);
		}		
		graphics.drawImage(this.hero.getSprite().getImage(),this.hero.getX()*32 , this.hero.getY()*32 , null);
		//graphics.drawImage(this.spell.getSprite().getImage(),this.hero.getX()*32 , this.hero.getY()*32 , null);
	}
}
