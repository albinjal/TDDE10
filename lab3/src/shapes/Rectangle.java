package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends PaintObject {
	private String ID = "RECTANGLE";
	public Rectangle(int x, int y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getID() {
		return this.ID;
	}
	
	@Override
	public void draw (Graphics g) {
		super.draw(g);
		g.fillRect(this.getX(), this.getY(), this.getSize(), this.getSize());
	}

}
