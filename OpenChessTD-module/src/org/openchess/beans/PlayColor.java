package org.openchess.beans;

public enum PlayColor {
	BLACK("B"), 
	WHITE("W"),
	UNREPORTED(" ");
	
	private String color;
	
	private PlayColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
}
