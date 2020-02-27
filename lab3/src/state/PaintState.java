package state;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import shapes.PaintObject;

public class PaintState implements Serializable {
	private ArrayList<PaintObject> objects = new ArrayList<PaintObject>();

	public PaintState() {
	}

	public void addObject(int x, int y, Settings set) {
		this.objects.add(PaintObject.generate(set.getShapeID(), x, y, set.getColor()));
	}

	public ArrayList<PaintObject> getObjects() {
		return this.objects;
	}

	public void clear() {
		this.objects.clear();
	}

	public void saveToFile() {
		JFileChooser fc = new JFileChooser();
		int option = fc.showSaveDialog(null);
		switch (option) {
		case JFileChooser.APPROVE_OPTION: {
			try {
				FileOutputStream fos = new FileOutputStream(fc.getSelectedFile());
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(this);
				oos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
	}

	public void loadFromFile() {
		JFileChooser fc = new JFileChooser();
		int option = fc.showOpenDialog(null);
		switch (option) {
		case JFileChooser.APPROVE_OPTION: {
			try {
				FileInputStream fis = new FileInputStream(fc.getSelectedFile());
				ObjectInputStream ois = new ObjectInputStream(fis);
				PaintState state = (PaintState) ois.readObject();
				ois.close();
				this.objects = state.objects;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		}

	}

}
