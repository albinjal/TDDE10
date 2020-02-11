package myutil;

public interface BaseList<E> extends BaseCollection {
	
	public void add(E element);
    
	public E getElementAt(int i);
}
