package paint_hd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import state.PaintState;
import state.Settings;

public class WindowFrame extends JFrame implements MouseListener, ActionListener {
	private final static double scaling = 0.5;
	private DrawArea drawArea;
	private ColorBar colorBar;
	private ShapeBar shapeBar;
	private ButtonBar buttonBar;
	private PaintState state = new PaintState();
	private Settings settings = new Settings();

	public WindowFrame() {
		super("Välkommen till Ritprogrammet!");

		setMeta();

		addPanels();
		this.setVisible(true);

	}

	private void addPanels() {
		this.buttonBar = new ButtonBar(this);
		getContentPane().add(this.buttonBar, BorderLayout.SOUTH);
		JPanel toolbar = new JPanel();
		getContentPane().add(toolbar, BorderLayout.EAST);
		toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.Y_AXIS));
		toolbar.setBackground(Color.gray);
		this.colorBar = new ColorBar(this.settings);
		this.colorBar.addColor(Color.blue);
		this.colorBar.addColor(Color.red);
		this.colorBar.addColor(Color.orange);
		this.colorBar.addColor(Color.yellow);
		this.colorBar.addColor(Color.green);

		toolbar.add(this.colorBar);
		
		this.shapeBar = new ShapeBar(this.settings);
		
		this.shapeBar.addShape("CIRCLE");
		this.shapeBar.addShape("RECTANGLE");
		toolbar.add(this.shapeBar);


		
		this.drawArea = new DrawArea();
		getContentPane().add(this.drawArea, BorderLayout.CENTER);
		this.drawArea.addMouseListener(this);
	}

	private void setMeta() {
		this.settings = new Settings();
		this.state = new PaintState();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int) (screenSize.getWidth() * scaling), (int) (screenSize.getHeight() * scaling));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.state.addObject(e.getX() - 25, e.getY() - 25, this.settings);
		this.drawArea.patchData(this.state.getObjects());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.state.clear();
		this.drawArea.patchData(this.state.getObjects());
	}
	

}
