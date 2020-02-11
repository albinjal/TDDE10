package myutil_tests;
import myutil.MyQueue;

public abstract class TestQueue {
	
	public static void test() {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.print();
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		queue.dequeue();
		queue.enqueue(5);
		queue.dequeue();
		queue.print();
		
		
		
	}
	
}
