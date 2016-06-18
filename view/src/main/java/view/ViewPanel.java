package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IElement;
import contract.ILorannWorldEntity;
import contract.IMobile;


/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame	viewFrame;
	
	//private ILorannWorldEntity lorannWorldEntity; 
	private final ArrayList<? extends IMobile> mobiles;
	
	private final IElement elements[][];

	private static final long	serialVersionUID	= -998294702363713521L;


	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMobile> mobiles, final IElement elements[][] ){
		this.setViewFrame(viewFrame);
		this.mobiles = mobiles;
		this.elements = elements;
		//this.viewFrame.getLorannWorldEntity().getObservable().addObserver(this);
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
		
		for(int y = 0; y < 5/*12*/;y++){
			for(int x = 0; x < 5/*20*/; x++){
				System.out.println("tests 1");
				System.out.println(viewFrame.getLorannWorldEntity().getElement(4,3));
				//if(viewFrame.getLorannWorldEntity().getElement(1, 1) !=null){
				if(this.elements[x][y] != null){
					System.out.println("tests 2");
					graphics.drawImage(this.elements[x][y].getSprite().getImage(), x*32, y*32,null);
				} else {
					System.out.println("tests 3");
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		
		for( final IMobile mobile : this.mobiles)
		graphics.drawImage(mobile.getSprite().getImage(),mobile.getX()*32 , mobile.getY()*32 , null);
	}
}
