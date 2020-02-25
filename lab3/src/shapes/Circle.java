package shapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends PaintObject {
	private String ID = "CIRCLE";
	public Circle(int x, int y, Color color) {
		super(x, y, color);
	}
	
	@Override
	public void draw (Graphics g) {
		super.draw(g);
		g.fillOval(this.getX(), this.getY(), this.getSize(), this.getSize());
	}
	
	public String getID() {
		return this.ID;
	}

}
