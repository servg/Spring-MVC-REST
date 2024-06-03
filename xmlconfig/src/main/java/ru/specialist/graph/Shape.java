package ru.specialist.graph;

public abstract class Shape {
	
	public static final String DEFAULT_COLOR="black";
	
	private String color;

	public String getColor() {
		if(color==null){return DEFAULT_COLOR;
		}
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void draw();
}
