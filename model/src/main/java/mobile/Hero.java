package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.ISprite;
import contract.OrientationOrder;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLessFactory;


public class Hero extends Mobile implements IHero{

	private int x;
	private ISprite sprite;
	private int y;
	private int saveX;
	private int saveY;
	private int XSpell = 0;
	private int YSpell = 0;
	private ILorannWorldEntity lorannWorldEntity;
	private Permeability permeability;
	public int coordonate;
	public ISpell spell;

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
			return(MobileFactory.getFromBddIdHero(1, lorannWorldEntity).getPermeability() == (Permeability.HEROABLE)); 
		}
		else {//if (MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)) {
			coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
			return(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE)|| MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.PENETRABLE )); 
		}
	}

	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}
	
	public int getXSpell() {
		return this.XSpell;
	}

	public int getYSpell() {
		return this.YSpell;
	}

	public void setXSpell(final int xSpell) {
		this.XSpell = xSpell;
	}
	public void setYSpell(final int ySpell) {
		this.YSpell = ySpell;
	}
	
	public void setSpell() {
		this.spell.setX(this.getX());
		this.spell.setY(this.getY());
	}
	
	public void moveUp(){
		if (isMovePossible(getX(), getY() - 1)){
			setY(getY() - 1);
		}
	}

	public void moveDown(){
		if (isMovePossible(getX(), getY() + 1)){
			setY(getY() + 1);
		}
	}

	public void moveRight(){
		if (isMovePossible(getX() + 1, getY())){
			setX(getX() + 1);
		}
	}

	public void moveLeft(){
		if (isMovePossible(getX() - 1, getY())){
			setX(getX() - 1);
		}
	}

	public void moveUpRight(){
		if (isMovePossible(getX() + 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() + 1);
		}
	}

	public void moveUpLeft(){
		if (isMovePossible(getX() - 1, getY() - 1)){
			setY(getY() - 1);
			setX(getX() - 1);
		}
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

	public void moveDownRight(){
		if (isMovePossible(getX() + 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() + 1);
		}
	}

	public void moveDownLeft(){
		if (isMovePossible(getX() - 1, getY() + 1)){
			setY(getY() + 1);
			setX(getX() - 1);
		}
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		//getLorannWorld().setMobileHasChanged();
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		//getLorannWorld().setMobileHasChanged();
	}
	public ISprite getSprite() {
		return sprite;
	}
	
	public void savePosition() {
		this.saveX =this.x;
		this.saveY = this.y;
	}
	public void setSaveX(final int saveX) {
		this.saveX = saveX;
	}

	public void setSaveY(final int saveY) {
		this.saveY = saveY;
	}

	public boolean executeMoveIfPossible(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}