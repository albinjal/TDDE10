package paint_hd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ColorBar extends JPanel {
	private static Color background = Color.gray;
	private Color selected;
	public ColorBar() {
		this.add(new JLabel("Färg"));
		this.setLayout(new GridLayout(10, 0));
		this.setBackground(background);
	}

	public void addColor(Color color) {
		JPanel button = new JPanel();
		button.setSize(new Dimension(1, 1));
		button.setBackground(color);
		button.setBorder(new LineBorder(background, 3));
		this.add(button);
	}

}
