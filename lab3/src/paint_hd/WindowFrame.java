package paint_hd;

import java.awt.*;

import javax.swing.*;

public class WindowFrame extends JFrame {
	private final static double scaling = 0.5;
	public WindowFrame() {
		super("Välkommen till Ritprogrammet!");
		JButton b = new JButton("lägg till text");
		b.addActionListener(e -> addText());
		this.add(b);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int) (screenSize.getWidth() * scaling), (int) (screenSize.getHeight() * scaling));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void addText() {
		JLabel text = new JLabel("Hej allesammans!");
		this.add(text);
	}

}
