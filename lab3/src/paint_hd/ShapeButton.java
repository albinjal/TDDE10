package paint_hd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import shapes.PaintObject;
import state.Settings;

public class ShapeButton extends JPanel {
	private PaintObject shape;
	private ShapeBar barRef;
	private Color background;
	
	public ShapeButton(String shapeID, Color background, ShapeBar barRef) {
		this.barRef = barRef;
		this.background = background;
		this.shape = PaintObject.generate(shapeID, 2, 2, Color.darkGray);
		this.shape.setSize(28);
		addMouseListener(this.barRef);
	}
	
	@Override
	public void paintComponent (Graphics g) {
		this.shape.draw(g);
		this.setBackground(this.background);
	}
	
	
	public void select() {
		this.shape.setColor(Color.blue);
		this.repaint();
	}
	
	public void deSelect() {
		this.shape.setColor(Color.darkGray);
		this.repaint();
	}
	
	
	public String getShapeID() {
		return this.shape.getID();
	}
	
}
