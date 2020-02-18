package myutil;

public class MyList<E> implements BaseList<E> {
	private MyNode<E> firstNode;

	@Override
	public boolean isEmpty() {
		return this.getFirstNode() == null;
	}

	@Override
	public int size() {
		int size = 0;
		MyNode<E> currentNode = this.getFirstNode();
		while (currentNode != null) {
			currentNode = currentNode.getNextRef();
			size++;
		}
		return size;

	}

	@Override
	public void print() {
		MyNode<E> currentNode = this.getFirstNode();
		while (currentNode != null) {
			System.out.print(currentNode.getData());
			System.out.print(" ");
			currentNode = currentNode.getNextRef();
		}
		System.out.println();
	}

	@Override
	public void add(E element) {
		this.setFirstNode(new MyNode<E>(element, this.getFirstNode()));
	}

	@Override
	public E getElementAt(int i) {
		int currentIndex = 0;
		MyNode<E> currentNode = this.getFirstNode();
		while (currentIndex < i) {
			if (currentNode == null) {
				throw new IndexOutOfBoundsException();
			}
			currentNode = currentNode.getNextRef();
			
			currentIndex++;
		}
		return currentNode.getData();
	}
	
	private MyNode<E> getFirstNode() {
		return this.firstNode;
	}
	
	private void setFirstNode(MyNode<E> node) {
		this.firstNode = node;
	}

	@Override
	public int getIndexOf(E element) {
		MyNode<E> currentNode = this.getFirstNode();
		if (currentNode == null) {
			return -1;
		}
		int i = 0;
		while (!currentNode.getData().equals(element)) {
		
			currentNode = currentNode.getNextRef();
			i++;
			if (currentNode == null) {
				return -1;
			}
		}

		return i;
	}

}
