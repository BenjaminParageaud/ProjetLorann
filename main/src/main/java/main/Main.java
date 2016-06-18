package main;

import controller.Controller;
import model.LorannWorldEntity;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {
	
		/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	public static void main(final String[] args) {
		final LorannWorldEntity lorannWorldEntity = new LorannWorldEntity();
		lorannWorldEntity.loadMap(1);
		final View view = new View(lorannWorldEntity);
		final Controller controller = new Controller(view, lorannWorldEntity);
		view.setController(controller);
		controller.control();
	}
}