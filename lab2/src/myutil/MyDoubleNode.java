package myutil;

public class MyDoubleNode<E> extends MyNode<E> {
	private MyDoubleNode<E> prevRef;
	
	public MyDoubleNode(E data, MyDoubleNode<E> nextRef, MyDoubleNode<E> prevRef) {
		super(data, nextRef);
		this.setPrevRef(prevRef);
	}
	
	public void setPrevRef(MyDoubleNode node) {
		this.prevRef = node;
	}
	
	public MyDoubleNode<E> getPrevRef() {
		return this.prevRef;
	}
}
