package myutil_tests;
import myutil.MyStack;
public abstract class TestStack {

	public TestStack() {
	}
	
	public static void test() {
		MyStack<Integer> testStack = new MyStack<Integer>();
		testStack.push(2);
		testStack.push(3);
		testStack.push(1);
		testStack.print();
		System.out.println(testStack.pop());
		testStack.print();
		System.out.println(testStack.size());
		System.out.println(testStack.isEmpty());
		testStack.push(3);
		testStack.push(1);
		testStack.print();
		testStack.pop();
		testStack.pop();
		testStack.pop();
		testStack.pop();
		testStack.pop();


	}
}
