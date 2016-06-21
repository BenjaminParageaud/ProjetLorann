/*
 * 
 */
package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	@SuppressWarnings("unused")
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.model.getLorannWorldEntity().play();
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	
	public void setModel(IModel model) {
		this.model = model;
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		
		switch (controllerOrder) {
		
			case Up:
				this.model.getLorannWorldEntity().getHero().moveUp();
				break;
			case Down:
				this.model.getLorannWorldEntity().getHero().moveDown();
				break;
			case Right:
				this.model.getLorannWorldEntity().getHero().moveRight();
				break;
			case Left:
				this.model.getLorannWorldEntity().getHero().moveLeft();
				break;
			case UpLeft:
				this.model.getLorannWorldEntity().getHero().moveUpLeft();
				break;
			case UpRight:
				this.model.getLorannWorldEntity().getHero().moveUpRight();
				break;
			case DownLeft:
				this.model.getLorannWorldEntity().getHero().moveDownLeft();
				break;
			case DownRight:
				this.model.getLorannWorldEntity().getHero().moveDownRight();
				break;
			case Space:
				this.model.getLorannWorldEntity().shot(10);
				break;
			case Nop:
				System.out.println("!!! Warning wrong touch !!!");
				break;

			default:
				break;
		}
	}

	public IModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}



}