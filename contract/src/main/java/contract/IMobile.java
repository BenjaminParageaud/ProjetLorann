package contract;


public interface IMobile extends IElement{

	public int getBddId();
	
	public int getX();
	
	public void setX(int x);

	public int getY();

	public void setY(int y);
	
	public ISprite getSprite();

	public void setSprite(ISprite sprite);
	
}
