package contract;

public interface IHero {

	//public void orientationMove (OrientationOrder orientationOrder);
	
	public void moveUp();
	
	public void moveDown();
	
	public void moveRight();
	
	public void moveLeft();
	
	public void moveUpRight();

	public void moveUpLeft();

	public void moveDownRight();

	public void moveDownLeft();

	public boolean isMovePossible(final int x, final int y);
	public boolean isHeroPosition(final int x, final int y);
	
	public int getX() ;
	public void setX(int x) ;


	public int getY() ;
	public void setY(int y);
	
	public ISprite getSprite();
	
	public Permeability getPermeability() ;
	
	
}
