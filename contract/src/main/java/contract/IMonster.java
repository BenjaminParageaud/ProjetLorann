package contract;



public interface IMonster extends IMobile{
	

	public int getX() ;
	
	public void setX(int x) ;

	public int getY() ;

	public void setY(int y) ;
	
	public ISprite getSprite() ;

	public void setSprite(ISprite sprite);
	
	public ILorannWorldEntity getLorannWorldEntity();

	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) ;
	
	public IStrategy getStrategy() ;

	public void setStrategy(IStrategy strategy) ;

	public boolean isMovePossible(final int x, final int y);
	
	public void moveUp();

	public void moveDown();

	public void moveRight();

	public void moveLeft();

	public void moveUpRight();

	public void moveUpLeft();
	
	public void moveDownRight();

	public void moveDownLeft();

	public int getBddId();

	public Permeability getPermeability();

	
		
	}
	
	

