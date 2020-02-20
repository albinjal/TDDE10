package paint_hd;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBar extends JPanel {
	public ButtonBar() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setBackground(Color.gray);
		this.addButtons();
	}
	
	private void addButtons() {
		JButton btnNewButton_2 = new JButton("Rensa");
		this.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Spara");
		this.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Öppna");
		this.add(btnNewButton);
	}
}
