package state;

import java.awt.Color;

import shapes.PaintObject;

public class Settings {
	private Color color;
	private String shapeID;
	public Settings() {
		
	}
	
	public String getShapeID() {
		return this.shapeID;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setShapeID(String id) {
		this.shapeID = id;
	}
}
