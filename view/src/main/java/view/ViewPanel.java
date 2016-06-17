package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IMobile;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame){
		this.setViewFrame(viewFrame);
		viewFrame.getLorannWorldEntity().getObservable().addObserver(this);
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
				
				if(this.Elements[x][y] !=null){
					graphics.drawString(this.Elements[x][y].getSprite().getImage(), x*32, y*32,null);
				} else {
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		
		for( final IMobile mobile : this.mobile)
		graphics.drawString(mobile.getSprite().getImage(),mobile.getX()*32 , mobile.getY()*32 , null);
	}
}
