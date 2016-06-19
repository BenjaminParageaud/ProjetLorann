package mobile;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISprite;
import contract.OrientationOrder;
import contract.Permeability;
import element.Sprite;
import motionless.MotionLessFactory;


public class Hero extends Mobile implements IHero{

	private int x;
	private ISprite sprite;
	private int y;
	private ILorannWorldEntity lorannWorldEntity;
	public int coordonate = 3;
	
	
	public Hero(ILorannWorldEntity lorannWorldEntity){
		super(new Sprite("LorannAnim.gif"), Permeability.HEROABLE, 1,  lorannWorldEntity);
		this.sprite = new Sprite("LorannAnim.gif");
	}
	
	
	public boolean isMovePossible(final int x, final int y){
		/*System.out.println("nop");
		System.out.println(getLorannWorldEntity().getElement(1,1).getBddId());
		coordonate = getLorannWorldEntity().getElement(x, y).getBddId();
		System.out.println("NNNNNNNN");
		System.out.println(coordonate);*/
		System.out.println("NNNNNNNN");
		
		//return(this.getLorannWorldEntity().getElement(x, y).getPermeability() == (Permeability.MEETINGABLE)||this.getLorannWorldEntity().getElement(x,y).getPermeability() == (Permeability.PENETRABLE )); 
		return(MotionLessFactory.getFromBddId(coordonate).getPermeability() == (Permeability.MEETINGABLE));//||this.getLorannWorldEntity().getElement(x,y).getPermeability() == (Permeability.PENETRABLE )); 
		/*System.out.println("AAAAAAA");
		*/
		
		/*m = elements[0][0].getBddId();
		
		System.out.println(MotionLessFactory.getFromBddId(m).getPermeability());
		System.out.println("CCCCCCC");*/
	}
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}


	public void orientationMove (OrientationOrder orientationOrder){
		
	switch (orientationOrder) {
	case Up:
		System.out.println("lol3");
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
		break;*/
	default:
		break;
}
	}
	
    public void moveUp(){
    	if (isMovePossible(getX(), getY() - 1)){
    		setY(getY() - 1);
    	}
	}
	/*public void moveUp(){
		System.out.println("lol4");
		super.moveUp();
	}
	
	public void moveDown(){
		super.moveDown();
	}
	
	public void moveRight(){
		super.moveRight();
	}
	
	public void moveLeft(){
		super.moveLeft();
	}
*/

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
	
}