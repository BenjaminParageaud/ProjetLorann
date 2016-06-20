package contract;



public interface IMonster extends IMobile{
	
	
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
	
	

