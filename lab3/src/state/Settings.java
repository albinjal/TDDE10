package state;

import java.awt.Color;

import shapes.PaintObject;

public class Settings {
	private Color color;
	private Class<? extends PaintObject> shape;
	public Settings() {
		// TODO Auto-generated constructor stub
	}
	
	public Class<? extends PaintObject> getShape() {
		return this.shape;
	}

}
