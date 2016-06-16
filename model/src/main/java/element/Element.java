package element;

import model.LorannWorldEntity;

public abstract class Element {
	
	private Sprite sprite;
	private Permeability permeability;
	private LorannWorldEntity lorannWorldEntity;

	


	public Element(final Sprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}


	public Sprite getSprite() {
		return sprite;
	}


	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	public LorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}


	public void setLorannWorldEntity(LorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}

}