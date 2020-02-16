package myutil_tests;
import myutil.BaseQueue;
import myutil.MyQueue;

public abstract class TestQueue {
	
	public static void test() {
		boolean works = true;
		BaseQueue<Integer> queue = new MyQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.print();
		if (queue.isEmpty()) {
			System.out.println("MyQueue.isEmpty() ERROR"); 
			works = false;
		}
		if (queue.size() != 3) {
			System.out.println("MyQueue.size() ERROR"); 
			works = false;
		}
		queue.dequeue();
		queue.enqueue(5);
		queue.dequeue();
		queue.print();
		if (!works) {
			System.out.println("MyQueue doesn't work");
		}
		else {
			System.out.println("MyQueue works");

		}
		
		
		
	}
	
}
