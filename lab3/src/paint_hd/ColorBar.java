package paint_hd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import state.Settings;

public class ColorBar extends JPanel implements MouseListener {
	private static Color background = Color.gray;
	private Settings settingsRef;
	private ArrayList<ColorButton> buttons = new ArrayList<ColorButton>();
	
	public ColorBar(Settings settings) {
		this.settingsRef = settings;
		this.add(new JLabel("Färg"));
		this.setLayout(new GridLayout(9, 1));
		this.setBackground(background);
	}

	public void addColor(Color color) {
		ColorButton button = new ColorButton(color, background, this);
		this.buttons.add(button);
		this.add(button);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Type casting is ok here since the ColorBar will only react to events from ColorButtons.
		this.selectButton((ColorButton) e.getSource());
	
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void selectIndex(int index) {
		this.selectButton(this.buttons.get(index));
	}
	
	
	private void selectButton(ColorButton button) {
		this.deSelectAll();
		button.select();
		this.settingsRef.setColor(button.getColor());
		
	}
	

	private void deSelectAll() {
		for (ColorButton button : this.buttons) {
			button.deSelect();
		}
	}


}
