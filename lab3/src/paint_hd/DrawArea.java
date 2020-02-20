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
	private ArrayList<PaintObject> objects = new ArrayList<PaintObject>();
	public DrawArea() {
	}
	
	
	@Override
	public void paintComponent (Graphics g) {
		for (PaintObject object : this.objects) {
			object.draw(g);
		}
	}
	
	public void patchData(ArrayList<PaintObject> objects) {
		this.objects = objects;
		this.repaint();
	}

	
}
