/*
 * 
 */
package element;

import contract.IElement;
import contract.ILorannWorldEntity;

import contract.ISprite;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 */
public abstract class Element implements IElement{
	
	/** The sprite. */
	private ISprite sprite;
	
	/** The permeability. */
	private Permeability permeability;
	
	/** The lorann world entity. */
	private ILorannWorldEntity lorannWorldEntity;

	


	/**
	 * Instantiates a new element.
	 *
	 * @param sprite the sprite
	 * @param permeability the permeability
	 */
	public Element(final ISprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}


	/* (non-Javadoc)
	 * @see contract.IElement#getSprite()
	 */
	public ISprite getSprite() {
		return sprite;
	}


	/* (non-Javadoc)
	 * @see contract.IElement#setSprite(contract.ISprite)
	 */
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}


	/* (non-Javadoc)
	 * @see contract.IElement#getPermeability()
	 */
	public Permeability getPermeability() {
		return permeability;
	}


	/* (non-Javadoc)
	 * @see contract.IElement#setPermeability(contract.Permeability)
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#getLorannWorldEntity()
	 */
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}


	/* (non-Javadoc)
	 * @see contract.IElement#setLorannWorldEntity(contract.ILorannWorldEntity)
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

}