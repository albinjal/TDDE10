package paint_hd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBar extends JPanel {
	public ButtonBar(ActionListener listener) {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setBackground(Color.gray);
		this.addButtons(listener);
	}
	
	private void addButtons(ActionListener listener) {
		JButton rensa = new JButton("Rensa");
		rensa.addActionListener(listener);
		this.add(rensa);
/*
		JButton btnNewButton_1 = new JButton("Spara");
		this.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Öppna");
		this.add(btnNewButton);
		*/
	}


	
}
