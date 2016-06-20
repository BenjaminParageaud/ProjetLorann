/*
 * 
 */
package contract;


// TODO: Auto-generated Javadoc
/**
 * The Interface IElement.
 */
public interface IElement {

	
	/**
	 * Gets the sprite.
	 *
	 * @return the sprite
	 */
	public ISprite getSprite();

	/**
	 * Sets the sprite.
	 *
	 * @param sprite the new sprite
	 */
	public void setSprite(ISprite sprite);

	/**
	 * Gets the permeability.
	 *
	 * @return the permeability
	 */
	public Permeability getPermeability();

	/**
	 * Sets the permeability.
	 *
	 * @param permeability the new permeability
	 */
	public void setPermeability(Permeability permeability);
	
	/**
	 * Gets the lorann world entity.
	 *
	 * @return the lorann world entity
	 */
	public ILorannWorldEntity getLorannWorldEntity();

	/**
	 * Sets the lorann world entity.
	 *
	 * @param lorannWorldEntity the new lorann world entity
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity);
}
