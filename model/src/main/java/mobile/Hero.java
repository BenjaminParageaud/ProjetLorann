/*
 * 
 */
package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.ISprite;
import contract.Permeability;
import element.Sprite;
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
		return true;
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
			else if(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MONSTERABLE)){
				getLorannWorldEntity().setAlive(1);
				getLorannWorldEntity().setMobilehasChanged();
				return false;
			}
			return false;
		}
		return false;
	}




	/* (non-Javadoc)
	 * @see contract.IHero#moveUp()
	 */
	public boolean moveUp(){
		if (isMovePossible(getX(), getY() - 1)){
			setY(getY() - 1);
			return getLorannWorldEntity().setElement(MotionLessFactory.getFromBddId(5),getX(), getY() +1 );
		}
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


}