package myutil;

public class MyStack<E> implements BaseStack<E> {
	
	private MyNode<E> topNode;
	
	public MyStack() {
	}

	@Override
	public void push(E element) {
		this.setTopNode(new MyNode<E>(element, this.getTopNode()));
	}

	@Override
	public E pop() {
		final MyNode<E> prevNode = this.getTopNode();
		if (prevNode == null) {
			throw new PopEmptyStackException();
		}
		this.setTopNode(prevNode.getNextRef());
		return prevNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return this.getTopNode() == null;
	}

	@Override
	public int size() {
		int size = 0;
		MyNode<E> currentNode = this.getTopNode();
		while (currentNode != null) {
			currentNode = currentNode.getNextRef();
			size++;
		}
		return size;
	}
	
	@Override
	public void print() {
		MyNode<E> currentNode = this.getTopNode();
		while (currentNode != null) {
			currentNode.printData();
			currentNode = currentNode.getNextRef();
		}
	}
	
	private MyNode<E> getTopNode() {
		return this.topNode;
	}
	
	private void setTopNode(MyNode<E> node) {
		this.topNode = node;
	}
	
}
