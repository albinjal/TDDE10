package myutil;

public interface BaseQueue<E> extends BaseCollection{
	 public void enqueue(E element);
	 
	 public E dequeue();

}
