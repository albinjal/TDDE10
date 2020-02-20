package paint_hd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import shapes.Circle;
import state.PaintState;

public class DrawArea extends JPanel implements MouseListener {
	
	public DrawArea() {
		addMouseListener(this);
	}
	
	
	@Override
	public void paintComponent (Graphics g) {
		new Circle(2, 2, Color.black).draw(g);
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println(arg0);
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
