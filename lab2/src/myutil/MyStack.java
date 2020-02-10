package myutil;

public class MyStack<E> implements BaseStack<E> {
	
	private MyNode<E> topNode;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(E element) {
		this.setTopNode(new MyNode<E>(element, this.getTopNode()));
	}

	@Override
	public E pop() {
		final MyNode<E> prevNode = this.getTopNode();
		this.setTopNode(prevNode.getRef());
		return prevNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return this.getTopNode() == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private MyNode<E> getTopNode() {
		return this.topNode;
	}
	
	private void setTopNode(MyNode<E> node) {
		this.topNode = node;
	}
}
