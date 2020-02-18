package shapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel {
	
	public Circle() {
	}
	
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(0, 0, 50, 50);
	}

}
