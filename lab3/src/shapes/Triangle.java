package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends PaintObject {
	private String ID = "TRIANGLE";
	public Triangle(int x, int y, Color color) {
		super(x, y, color);
	}
	
	@Override
	public void draw (Graphics g) {
		super.draw(g);
		Polygon triangle = new Polygon();
		triangle.addPoint(this.getX() + this.getSize() / 2, this.getY() + this.getSize());
		triangle.addPoint(this.getX(), this.getY());
		triangle.addPoint(this.getX() + this.getSize(), this.getY());
		g.fillPolygon(triangle);
		}
	
	@Override
	public String getID() {
		return this.ID;
	}
	
	

}
