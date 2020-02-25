package paint_hd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import shapes.Circle;
import shapes.PaintObject;
import state.PaintState;

public class DrawArea extends JPanel {
	PaintState state;
	public DrawArea(PaintState state) {
		this.state = state;
	}
	
	
	@Override
	public void paintComponent (Graphics g) {
		for (PaintObject object : this.state.getObjects()) {
			System.out.println(object);
			object.draw(g);
		}
	}
	
}
