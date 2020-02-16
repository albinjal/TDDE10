package myutil;

public class MyNode<E> {
	private MyNode<E> nextRef;
	private E data;
	
	public MyNode(E data, MyNode<E> nextRef) {
		this.setData(data);
		this.setNextRef(nextRef);
	}
	
	public void printData() {
		System.out.println(data);
	}
	
	public MyNode<E> getNextRef() {
		return this.nextRef;
	}
	
	public void setNextRef(MyNode<E> node) {
		this.nextRef = node;
	}
	
	public E getData() {
		return this.data;
	}
	
	public void setData(E data) {
		this.data = data;
	}

}
