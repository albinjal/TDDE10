package myutil_tests;

import myutil.MyNode;

public class TestNode {
	public static void test() {
		MyNode<Integer> node = new MyNode<Integer>(5, null);
		node.printData();
		System.out.println(node.getNextRef());
	}
}
