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

import state.PaintState;
import state.Settings;

public class WindowFrame extends JFrame {
	private final static double scaling = 0.5;
	private DrawArea drawArea;
	private ColorBar colorBar;
	private ShapeBar shapeBar;
	private ButtonBar buttonBar;
	private PaintState state = new PaintState();
	private Settings setting = new Settings();

	public WindowFrame() {
		super("Välkommen till Ritprogrammet!");

		setMeta();

		addPanels();
		this.setVisible(true);

	}

	private void addPanels() {
		this.buttonBar = new ButtonBar();
		getContentPane().add(this.buttonBar, BorderLayout.SOUTH);

		JPanel toolbar = new JPanel();
		getContentPane().add(toolbar, BorderLayout.EAST);
		toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.Y_AXIS));
		toolbar.setBackground(Color.gray);

		this.shapeBar = new ShapeBar();
		toolbar.add(this.shapeBar);

		this.colorBar = new ColorBar();
		this.colorBar.addColor(Color.blue);
		this.colorBar.addColor(Color.red);
		toolbar.add(this.colorBar);
		
		this.drawArea = new DrawArea();
		getContentPane().add(this.drawArea, BorderLayout.CENTER);
	}

	private void setMeta() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int) (screenSize.getWidth() * scaling), (int) (screenSize.getHeight() * scaling));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
