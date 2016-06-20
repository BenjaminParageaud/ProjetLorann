package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.ISprite;
import contract.Permeability;
import element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	private final int bddId;
	private ISprite sprite;
	protected ILorannWorldEntity lorannWorldEntity;
	private int x;
	private int y;
	private ISpell spell; 
	private int XSpell = 0;
	private int YSpell = 0;
	private int saveX;
	private int saveY;

	public Mobile(final ISprite sprite, final Permeability permeability, final int bddId, ILorannWorldEntity lorannWorldEntity){
	    super(sprite, permeability);
	    this.bddId = bddId;
	    this.lorannWorldEntity = lorannWorldEntity;
		//this.spell = MobileFactory.getFromFileSymbolMotion('S',this.getLorannWorldEntity());
	}

	public int getBddId() {
		return bddId;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
		this.getLorannWorldEntity().setMobilehasChanged();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.getLorannWorldEntity().setMobilehasChanged();
	}
	/*
	public void setSpell() {
		this.spell.setX(this.getX());
		this.spell.setY(this.getY());
	}
	*/
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	/*
	public IMobile getSpell(){
		return this.spell;
	}
	*/
	public int getXSpell() {
		return this.XSpell;
	}

	public int getYSpell() {
		return this.YSpell;
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
	
	public ILorannWorldEntity getLorannWorldEntity() {
		return lorannWorldEntity;
	}

	public void setLorannWorldEntity(final ILorannWorldEntity lorannWorldEntity, final int x, final int y) {
		super.setLorannWorldEntity(lorannWorldEntity);;
		this.lorannWorldEntity = lorannWorldEntity;
		this.setX(x);
		this.setY(y);
	}
	
}