package myutil;

public class MyNode<E> {
	private MyNode<E> ref;
	private E data;
	
	public MyNode(E data, MyNode<E> ref) {
		this.setData(data);
		this.setRef(ref);
	}
	
	public MyNode<E> getRef() {
		return this.ref;
	}
	
	public void setRef(MyNode<E> node) {
		this.ref = node;
	}
	
	public E getData() {
		return this.data;
	}
	
	public void setData(E data) {
		this.data = data;
	}

}
