package paint_hd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	private final static double scaling = 0.5;
	private DrawArea drawArea;
	private ColorBar colorArea;
	private JPanel shapeArea;
	private JPanel toolbar;

	public WindowFrame() {
		super("Välkommen till Ritprogrammet!");

		setMeta();

		addPanels();
		this.setVisible(true);

	}

	private void addPanels() {
		this.toolbar = new JPanel();
		getContentPane().add(this.toolbar, BorderLayout.SOUTH);
		this.toolbar.setLayout(new BoxLayout(this.toolbar, BoxLayout.X_AXIS));
		this.toolbar.setBackground(Color.gray);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.gray);

		this.shapeArea = new JPanel();
		panel.add(this.shapeArea);

		this.colorArea = new ColorBar();
		this.colorArea.addColor(Color.blue);
		this.colorArea.addColor(Color.red);
		panel.add(this.colorArea);
		
		this.drawArea = new DrawArea();
		getContentPane().add(this.drawArea, BorderLayout.CENTER);
	}

	private void addButtons() {
		JButton btnNewButton_2 = new JButton("Rensa");
		this.toolbar.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Spara");
		this.toolbar.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Öppna");
		this.toolbar.add(btnNewButton);
	}

	private void addLabels() {
		JLabel lblNewLabel_1 = new JLabel("Form");
		this.shapeArea.add(lblNewLabel_1);
		this.shapeArea.setBackground(Color.gray);
		

	}

	private void setMeta() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int) (screenSize.getWidth() * scaling), (int) (screenSize.getHeight() * scaling));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
