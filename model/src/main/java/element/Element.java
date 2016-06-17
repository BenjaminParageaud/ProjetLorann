package element;

import contract.IElement;
import contract.ILorannWorldEntity;

import contract.ISprite;
import contract.Permeability;
import model.LorannWorldEntity;

public abstract class Element implements IElement{
	
	private ISprite sprite;
	private Permeability permeability;
	private ILorannWorldEntity lorannWorldEntity;

	


	public Element(final ISprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}


	public ISprite getSprite() {
		return sprite;
	}


	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}


	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

}