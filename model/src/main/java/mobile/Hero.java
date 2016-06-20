package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMotionLess;
import contract.ISprite;
import contract.OrientationOrder;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLess;
import motionless.MotionLessFactory;


public class Hero extends Mobile implements IHero{

	private int x;
	private ISprite sprite;
	private int y;
	private ILorannWorldEntity lorannWorldEntity;
	private Permeability permeability;
	private int coordonate;
	private int alive;




	public Hero(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1,  lorannWorldEntity);
		this.sprite = new Sprite("LorannAnim.gif");
		setLorannWorldEntity(lorannWorldEntity);
		setPermeability(Permeability.HEROABLE);
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public boolean isMovePossible(final int x, final int y){
		if(getLorannWorldEntity().getElement(x, y) == null){
			getLorannWorldEntity().setMobilehasChanged();
			return false ; 
		}
		else if(getLorannWorldEntity().getElement(x, y) != null) {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			if(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE) || MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )){
				if(getLorannWorldEntity().getElement(x, y) == MotionLessFactory.getFromBddId(1)){
					getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(8), getLorannWorldEntity().getXdoor(), getLorannWorldEntity().getYdoor());
					getLorannWorldEntity().setMobilehasChanged();

				}
				return true;
			}
			return false;
		}
		return false;
	}


	/*
   public int kill(final int x, final int y){
	   coordonate = getLorannWorldEntity().getMobiles(x, y).getBddId();

	   if(MobileFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MONSTERABLE)){
		   return alive; 
	   }

   }*/


	/*public void orientationMove (OrientationOrder orientationOrder){

	switch (orientationOrder) {
	case Up:
		moveUp();
		break;
	case Down:
		//this.model.loadMessage("FR");
		break;
	/*case Right:
		//this.model.loadMessage("DE");
		break;
	case Left:
		//this.model.loadMessage("ID");
		break;
	case UpLeft:
		//this.model.loadMessage("ID");
		break;
	case UpRight:
		//this.model.loadMessage("ID");
		break;
	case DownLeft:
		//this.model.loadMessage("ID");
		break;
	case DownRight:
		//this.model.loadMessage("ID");
		break;
	default:
		break;
}
	}*/

	public boolean moveUp(){
		if (isMovePossible(getX(), getY() - 1)){
			setY(getY() - 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX(), getY() +1 );
		}
		return false;
	}


public boolean moveDown(){
	if (isMovePossible(getX(), getY() + 1)){
		setY(getY() + 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX(), getY() - 1);
	}
	return false;
}

public boolean moveRight(){
	if (isMovePossible(getX() + 1, getY())){
		setX(getX() + 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY());
	}
	return false;
}

public boolean moveLeft(){
	if (isMovePossible(getX() - 1, getY())){
		setX(getX() - 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY());
	}
	return false;
}

public boolean moveUpRight(){
	if (isMovePossible(getX() + 1, getY() - 1)){
		setY(getY() - 1);
		setX(getX() + 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY() + 1);
	}
	return false;
}

public boolean moveUpLeft(){
	if (isMovePossible(getX() - 1, getY() - 1)){
		setY(getY() - 1);
		setX(getX() - 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY() + 1);
	}
	return false;
}


public boolean moveDownRight(){
	if (isMovePossible(getX() + 1, getY() + 1)){
		setY(getY() + 1);
		setX(getX() + 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY() - 1);
	}
	return false;
}

public boolean moveDownLeft(){
	if (isMovePossible(getX() - 1, getY() + 1)){
		setY(getY() + 1);
		setX(getX() - 1);
		return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY() - 1);
	}
	return false;
}


public void setSprite(ISprite sprite) {
	this.sprite = sprite;
}


public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
	this.lorannWorldEntity = lorannWorldEntity;
}


public void setPermeability(Permeability permeability) {
	this.permeability = permeability;
}


public int getX() {
	return x;
}


public void setX(int x) {
	this.x = x;
}


public int getY() {
	return y;
}

public ILorannWorldEntity getLorannWorldEntity() {
	return lorannWorldEntity;
}

public void setY(int y) {
	this.y = y;
}
public ISprite getSprite() {
	return sprite;
}
/*
	public int getAlive() {
		return alive;
	}


	public void setAlive(int alive) {
		this.alive = alive;
	}*/

}