package state;

import java.util.ArrayList;

import shapes.PaintObject;

public class PaintState {
	private ArrayList<PaintObject> objects = new ArrayList<PaintObject>();
	public PaintState() {
		// TODO Auto-generated constructor stub
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

}
