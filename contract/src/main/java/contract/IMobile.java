package contract;

import java.awt.Point;

public interface IMobile extends IElement{

	public int getBddId();


	public Point getPosition() ;

	public void setPosition(Point position);

	public int getX() ;
	
	public void setX(int x) ;

	public int getY() ;

	public void setY(int y) ;
	
	public ISprite getSprite() ;

	public void setSprite(ISprite sprite);
	
	public boolean isMovePossible(final int x, final int y);
	
    public void moveUp();
	
	public void moveDown();
	
	public void moveRight();
	
	public void moveLeft();
	
	public ILorannWorldEntity getLorannWorldEntity();

	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) ;
	
	
}
