package paint_hd;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import shapes.PaintObject;
import state.Settings;

public class ShapeBar extends JPanel implements MouseListener {
	private static Color background = Color.gray;
	private Settings settingsRef;
	private ArrayList<ShapeButton> buttons = new ArrayList<ShapeButton>();
	
	public ShapeBar(Settings settings) {
		this.settingsRef = settings;
		JLabel lblNewLabel_1 = new JLabel("Form");
		this.add(lblNewLabel_1);
		this.setLayout(new GridLayout(4, 0));
		this.setBackground(background);
	}
	
	public void addShape(String id) {
		ShapeButton button = new ShapeButton(id, background, this);
		this.buttons.add(button);
		this.add(button);
	}
	
	public void selectIndex(int index) {
		this.selectButton(this.buttons.get(index));
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
		// Type casting is ok here since the ShapeBar will only react to events from ShapeButtons.
		this.selectButton((ShapeButton) e.getSource());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void selectButton(ShapeButton button) {
		this.deSelectAll();
		button.select();
		this.settingsRef.setShapeID(button.getShapeID());
	}
	 
	
	private void deSelectAll() {
		for (ShapeButton button : this.buttons) {
			button.deSelect();
		}
	}
}
