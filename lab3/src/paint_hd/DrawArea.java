package paint_hd;

import java.awt.Graphics;

import javax.swing.JPanel;

import shapes.PaintObject;
import state.PaintState;

public class DrawArea extends JPanel {
	PaintState state;

	public DrawArea(PaintState state) {
		this.state = state;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (PaintObject object : this.state.getObjects()) {
			object.draw(g);
		}
	}

}
