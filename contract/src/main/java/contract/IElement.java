package contract;


public interface IElement {

	
	public ISprite getSprite();

	public void setSprite(ISprite sprite);

	public Permeability getPermeability();

	public void setPermeability(Permeability permeability);
	
	public ILorannWorldEntity getLorannWorldEntity();

	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity);
}
