package state;

import java.awt.Color;

import shapes.PaintObject;

public class Settings {
	private Color color = Color.black;
	private String shapeID = "CIRCLE";
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
