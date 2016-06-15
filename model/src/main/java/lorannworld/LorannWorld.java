package lorannworld;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;


import element.Element;
import mobile.Hero;
import mobile.Mobile;

public class LorannWorld extends Observable { //extends Entity {
	public Element 										elements[][];
	public final ArrayList<Mobile>						mobiles;
	private int											width;
	private int											height;
	private Hero										hero;

	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public LorannWorld(){
		this.mobiles = new ArrayList<Mobile>();
	}
	
	/*public LorannWorld(int width, int height){
		this.width = width;
		this.height = height;
	}*/

	public LorannWorld(final String fileName) throws IOException {
		this();
		//this.loadFile(fileName);
	}
	
	public void addElement(final Element element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
		//	element.setLorannWorld(this);
		}
		this.setChanged();
	}
	
	public void getElement(int x, int y){
		
	}
	
	public void addMobile(Hero hero, int x, int y){
		
	}

	public Element[][] getElement(){
		return this.elements;		
	}
	
	public Hero getHero(){
		return this.hero;
		
	}
	
	public ArrayList<Mobile> getMobiles(){
		return this.mobiles;
	}

	public void setHero(final Hero hero) {
		this.hero = hero;
		this.setChanged();
	}
	
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	public void notifyObservers(){
		super.notifyObservers();
	}
	
	public void addMobile(Mobile mobile, int x, int y){
		this.mobiles.add(mobile);
	//	mobile.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}
	
	@SuppressWarnings("unused")
	private void loadLorannWorld(){
		
	}
}

