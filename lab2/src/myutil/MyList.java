package myutil;

public class MyList<E> implements BaseList<E> {
	private MyNode<E> firstNode;
	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public int size() {
		int size = 0;
		MyNode<E> currentNode = this.firstNode;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.getNextRef();
		}
		return size;
		
	}

	@Override
	public void print() {
		MyNode<E> currentNode = this.firstNode;
		while (currentNode != null) {
			System.out.print(currentNode.getData());
			currentNode = currentNode.getNextRef();
		}
	}

	@Override
	public void add(E element) {
		

	}

	@Override
	public E getElementAt(int i) {
		
		return null;
	}

}
