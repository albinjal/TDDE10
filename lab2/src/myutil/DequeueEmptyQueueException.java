package myutil;


public class DequeueEmptyQueueException extends RuntimeException {

	public DequeueEmptyQueueException() {
		super("Can't remove from empty queue.");
	}
}
