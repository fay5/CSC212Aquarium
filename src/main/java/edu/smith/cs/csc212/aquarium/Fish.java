package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	Color color;
	int x;
	int y; 
	
	public Fish(Color c, int startX, int startY) {
		this.color = c;
		this.x = startX;
		this.y = startY;
}
	
	public void draw (Graphics2D window) {
		
		//BIG FISH 
		
		DrawFish.facingLeft(window,this.color, this.x, this.y);
		
		DrawFish.facingRight(window, this.color, this.x, this.y);
		
		//SMALLER FISH
		
		DrawFish.smallFacingLeft(window,this.color, this.x, this.y);
		
		DrawFish.smallFacingRight(window, this.color, this.x, this.y);
	}
	
	public void swim() {
		//this.y +=1;
	}
}