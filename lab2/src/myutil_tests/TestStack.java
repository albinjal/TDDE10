package myutil_tests;
import myutil.BaseStack;
import myutil.MyStack;
public abstract class TestStack {

	public TestStack() {
	}
	
	public static void test() {
		boolean works = true;
		BaseStack<Integer> testStack = new MyStack<Integer>();
		testStack.push(2);
		testStack.push(3);
		testStack.push(1);
		testStack.print();
		if (testStack.size() != 3) {
			System.out.print("MyStack.size() ERROR");
			works = false;
		}
		if (testStack.pop() != 1 || testStack.size() != 2) {
			System.out.print("MyStack.pop() ERROR");
			works = false;
		}
		testStack.print();
		if (testStack.isEmpty()) {
			System.out.print("MyStack.isEmpty() ERROR");
			works = false;
		}
		if (!works) {
			System.out.print("MyStack doesn't work");
		}
		else {
			System.out.print("MyStack works");

		}



	}
}
