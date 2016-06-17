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
		this.view.printMessage("Bienvenue dans le monde de Nova-Ann.\n Lorann, Maître du Sortilège, a besoin de ta force et de ta ruse ! \n Libère les cent-une cryptes possédées par le Masque de Nékron, en touchant la \nBulle Energie qui se trouve dans chacune d'elles. Rapporte les éphémères Idoles \nde la Vie à la Caverne, chacune te vaudra deux Vies supplémentaires. Ramasse \nles fabuleux trésors qui t'attendent et ta richesse sera immense ! Evite les \nattaques des quatre épouvantables Démons créés par l'infâme Nékron, en \nutilisant habilement ton très puissant Sortilège multicolore qui obéit à ta \nvolonté. \nLa gloire t'attend, Lorann... Que le Sortilège te protège !  ");
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
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case English:
				this.model.loadMessage("GB");
				break;
			case Francais:
				this.model.loadMessage("FR");
				break;
			case Deutsch:
				this.model.loadMessage("DE");
				break;
			case Indonesia:
				this.model.loadMessage("ID");
				break;

			default:
				break;
		}
	}

}
