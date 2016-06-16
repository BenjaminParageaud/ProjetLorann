package mobile;

import element.Permeability;

import element.Sprite;
import element.Element;

import java.awt.Point;

import aedt.showboard.IPawn;

public abstract class Mobile extends Element implements IPawn, IMobile{
	private final Point position;
	
	public Mobile(final Sprite sprite, final Permeability permeability){
	    super(sprite, permeability);
	    this.position = new Point();
	}
	
	public int getX() {
		return this.position.x;
	}
	
	public Point getPosition() {
		return this.position;
	}
	
	public int getY() {
		return this.position.y;
	}
	
	public boolean isMovePossible(final int x, final int y){
		return true;
	}
	
	public void setLorannWorld(final int x, final int y){
		setX(x);
		setY(y);
	}
	
	public int setX(int x){
		return 1;
	}
	
	public int setY(int y){
		return 1;
	}
	
	public void moveUp(){
		if (this.isMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}
	
	public void moveDown(){
		if (this.isMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}
	
	public void moveRight(){
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	
	public void moveLeft(){
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
		}
	}