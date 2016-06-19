package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.ILorannWorldEntity;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener {

	private IModel	model;
	
	private IController		controller;
	
	private static final long	serialVersionUID	= -697358409737458175L;

	
	public ViewFrame(final IModel model) throws HeadlessException {
		this.setModel(model);
		this.buildViewFrame(model);
		//this.controller = controller;
	}


	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}


	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}


	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	private IController getController() {
		return this.controller;
	}

	protected void setController(final IController controller) {
		this.controller = controller;
	}

	
	protected IModel getModel() {
		return this.model;
	}

	private void setModel(final IModel model) {
		this.model = model;
	}


	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setController(this.controller);
		this.setContentPane(new ViewPanel(this, model.getLorannWorldEntity().getMobiles(), model.getLorannWorldEntity().getElements()));
		this.setSize(650 + this.getInsets().left + this.getInsets().right, 415 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	/*public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {

	}
}
