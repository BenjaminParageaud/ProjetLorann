package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.ILorannWorldEntity;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener {

	private ILorannWorldEntity	lorannWorldEntity;
	
	private IController		controller;
	
	private static final long	serialVersionUID	= -697358409737458175L;

	
	public ViewFrame(final ILorannWorldEntity lorannWorldEntity) throws HeadlessException {
		this.buildViewFrame(lorannWorldEntity);
	}


	public ViewFrame(final ILorannWorldEntity lorannWorldEntity, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(lorannWorldEntity);
	}


	public ViewFrame(final ILorannWorldEntity lorannWorldEntity, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(lorannWorldEntity);
	}


	public ViewFrame(final ILorannWorldEntity lorannWorldEntity, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(lorannWorldEntity);
	}

	private IController getController() {
		return this.controller;
	}

	protected void setController(final IController controller) {
		this.controller = controller;
	}

	
	protected ILorannWorldEntity getLorannWorldEntity() {
		return this.lorannWorldEntity;
	}

	private void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}


	private void buildViewFrame(final ILorannWorldEntity lorannWorldEntity) {
		this.setLorannWorldEntity(lorannWorldEntity);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(400 + this.getInsets().left + this.getInsets().right, 60 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

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
