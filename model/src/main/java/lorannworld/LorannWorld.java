package lorannworld;

import java.util.ArrayList;


import element.Element;
import mobile.Hero;
import mobile.Mobile;

public class LorannWorld {
	private Integer width;
	private Integer height;
	
	public Integer getWidth() {
		return width;
	}

	public Integer getHeight() {
		return height;
	}


	
	public LorannWorld(){
		
	}
	
	public LorannWorld(Integer width, Integer height){
		this.width = width;
		this.height = height;
	}


	public LorannWorld(String fileName){
		
	}
	
	public void addElement(Element element, Integer x, Integer y){
		
	}
	
	public void getElement(Integer x, Integer y){
		
	}
	
	public void addMobile(Hero hero, Integer x, Integer y){
		
	}

	public Element[][] getElement(){
		return null;
		
	}
	
	public Hero getHero(){
		return null;
		
	}
	
	public ArrayList<Mobile> getMobiles(){
		return null;
		
	}

	public void setHero(Hero hero){
		
	}
	
	public void setMobilehasChanged(){
		
	}
	
	public void notifyObservers(){
		
	}
	
	public void addMobile(Mobile mobile, Integer x, Integer y){
		
	}
	
	@SuppressWarnings("unused")
	private void loadLorannWorld(){
		
	}
}

