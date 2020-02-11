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
		MyNode<E> currentNode = this.getFirstNode();
		while (currentNode != null) {
			size++;
			currentNode = currentNode.getNextRef();
		}
		return size;

	}

	@Override
	public void print() {
		MyNode<E> currentNode = this.getFirstNode();
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNextRef();
		}
	}

	@Override
	public void add(E element) {
		this.setFirstNode(new MyNode<E>(element, this.getFirstNode()));
	}

	@Override
	public E getElementAt(int i) {
		if (i >= this.size() ) {
			throw new GetElementAtEmptyListException();
		}
		int currentIndex = 0;
		MyNode<E> currentNode = this.getFirstNode();
		while (currentIndex < i) {
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

}
