package paint_hd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import state.Settings;

public class ColorButton extends JPanel {
	private ColorBar barRef;
	private Color color;
	private Border defBorder;
	public ColorButton(Color color, Color background, ColorBar barRef) {
		this.color = color;
		this.barRef = barRef;
		this.setSize(new Dimension(1, 1));
		this.setBackground(this.color);
		this.defBorder = new LineBorder(background, 3);
		this.setBorder(this.defBorder);
		addMouseListener(this.barRef);
		this.setName(this.color.toString());
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void select() {
		this.setBorder(new LineBorder(Color.black, 3));
	}
	
	public void deSelect() {
		this.setBorder(this.defBorder);
	}
	
}
