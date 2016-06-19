package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.ILorannWorldEntity;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
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
		this.view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
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
				//this.model.loadMessage("GB");
				break;
			case Down:
				//this.model.loadMessage("FR");
				break;
			case Right:
				//this.model.loadMessage("DE");
				break;
			case Left:
				//this.model.loadMessage("ID");
				break;
			case UpLeft:
				//this.model.loadMessage("ID");
				break;
			case UpRight:
				//this.model.loadMessage("ID");
				break;
			case DownLeft:
				//this.model.loadMessage("ID");
				break;
			case DownRight:
				//this.model.loadMessage("ID");
				break;
			case Space:
				//this.model.loadMessage("ID");
				break;

			default:
				break;
		}
	}



}
