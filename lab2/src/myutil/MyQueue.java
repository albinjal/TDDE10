package myutil;

public class MyQueue<E> implements BaseQueue<E> {
	private MyNode<E> firstNode;
	private MyNode<E> lastNode;
	
	public MyQueue() {
	}

	@Override
	public void enqueue(E element) {
		MyNode<E> newLastNode = new MyNode<E>(element, null);
		MyNode<E> currentLastNode = this.getLastNode();
		if (currentLastNode == null) {
			this.setFirstNode(newLastNode);
		} else {
			currentLastNode.setNextRef(newLastNode);
		}
		this.setLastNode(newLastNode);
	}

	@Override
	public E dequeue() {
		MyNode<E> prevFirstNode = this.getFirstNode();
		if (prevFirstNode == null) {
			throw new DequeueEmptyQueueException();
		}
		this.setFirstNode(prevFirstNode.getNextRef());
		return prevFirstNode.getData();

	}

	@Override
	public boolean isEmpty() {
		return this.firstNode == null;
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
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNextRef();
		}
	}
	
	private MyNode<E> getFirstNode() {
		return this.firstNode;
	}
	
	private void setFirstNode(MyNode<E> node) {
		this.firstNode = node;
	}
	
	private MyNode<E> getLastNode() {
		return this.lastNode;
	}
	
	private void setLastNode(MyNode<E> node) {
		this.lastNode = node;
	}

}
