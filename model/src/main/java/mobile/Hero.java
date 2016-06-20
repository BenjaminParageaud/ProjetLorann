/*
 * 
 */
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


// TODO: Auto-generated Javadoc
/**
 * The Class Hero.
 */
public class Hero extends Mobile implements IHero{

	/** The x. */
	private int x;
	
	/** The sprite. */
	private ISprite sprite;
	
	/** The y. */
	private int y;
	
	/** The lorann world entity. */
	private ILorannWorldEntity lorannWorldEntity;
	
	/** The permeability. */
	private Permeability permeability;
	
	/** The coordonate. */
	private int coordonate;
	//private int alive;




	/**
	 * Instantiates a new hero.
	 *
	 * @param lorannWorldEntity the lorann world entity
	 */
	public Hero(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1,  lorannWorldEntity);
		this.sprite = new Sprite("LorannAnim.gif");
		setLorannWorldEntity(lorannWorldEntity);
		setPermeability(Permeability.HEROABLE);
	}


	/* (non-Javadoc)
	 * @see element.Element#getPermeability()
	 */
	public Permeability getPermeability() {
		return permeability;
	}


	/* (non-Javadoc)
	 * @see contract.IHero#isMovePossible(int, int)
	 */
	public boolean isMovePossible(final int x, final int y){
		if(getLorannWorldEntity().getElement(x, y) == null){
			return(MobileFactory.getFromBddIdHero(1, lorannWorldEntity).getPermeability() == (Permeability.HEROABLE)); 
		}
		else {//(getLorannWorldEntity().getElement(x, y) != null) {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			return(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)|| MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )); 
		}
		//return false;
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

	/* (non-Javadoc)
 * @see contract.IHero#moveUp()
 */
public boolean moveUp(){
		if (isMovePossible(getX(), getY() - 1)){
			coordonate = getLorannWorldEntity().getElement(getX(), getY() - 1).getBddId();
			if(coordonate == 1 ){
				getLorannWorldEntity().getElement(getX(), getY() - 1).setPermeability(Permeability.MEETINGABLE);;
				 //setState();
				setY(getY() - 1);
			}
			else{
				setY(getY() - 1);
			}
			
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX(), getY() +1 );
		}
		/*
		else if(kill(getX(), getY()- 1)){
			return true;
		}*/
		return false;
		
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveDown()
	 */
	public boolean moveDown(){
		if (isMovePossible(getX(), getY() + 1)){
			setY(getY() + 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX(), getY() - 1);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveRight()
	 */
	public boolean moveRight(){
		if (isMovePossible(getX() + 1, getY())){
			setX(getX() + 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveLeft()
	 */
	public boolean moveLeft(){
		if (isMovePossible(getX() - 1, getY())){
			setX(getX() - 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveUpRight()
	 */
	public boolean moveUpRight(){
		if (isMovePossible(getX() + 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() + 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY() + 1);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveUpLeft()
	 */
	public boolean moveUpLeft(){
		if (isMovePossible(getX() - 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() - 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY() + 1);
		}
		return false;
	}

	
	/* (non-Javadoc)
	 * @see contract.IHero#moveDownRight()
	 */
	public boolean moveDownRight(){
		if (isMovePossible(getX() + 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() + 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() - 1, getY() - 1);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IHero#moveDownLeft()
	 */
	public boolean moveDownLeft(){
		if (isMovePossible(getX() - 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() - 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX() + 1, getY() - 1);
		}
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see mobile.Mobile#setSprite(contract.ISprite)
	 */
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}


	/* (non-Javadoc)
	 * @see element.Element#setLorannWorldEntity(contract.ILorannWorldEntity)
	 */
	public void setLorannWorldEntity(ILorannWorldEntity lorannWorldEntity) {
		this.lorannWorldEntity = lorannWorldEntity;
	}


	/* (non-Javadoc)
	 * @see element.Element#setPermeability(contract.Permeability)
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}


	/* (non-Javadoc)
	 * @see mobile.Mobile#getX()
	 */
	public int getX() {
		return x;
	}


	/* (non-Javadoc)
	 * @see mobile.Mobile#setX(int)
	 */
	public void setX(int x) {
		this.x = x;
	}


	/* (non-Javadoc)
	 * @see mobile.Mobile#getY()
	 */
	public int getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#getLorannWorldEntity()
	 */
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#setY(int)
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/* (non-Javadoc)
	 * @see mobile.Mobile#getSprite()
	 */
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