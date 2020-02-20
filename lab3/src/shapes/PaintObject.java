package shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class PaintObject {
	private int x;
	private int y;
	private Color color;
	private int size = 50;
	
	public PaintObject(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw (Graphics g) {
		g.setColor(this.color);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public static PaintObject generate(String id, int x, int y, Color color) {
		switch(id) {
		default: return new Circle(x, y, color);
		}
	}
		
}
