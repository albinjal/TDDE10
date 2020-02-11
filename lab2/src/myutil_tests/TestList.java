package myutil_tests;
import myutil.MyList;

public abstract class TestList {

	public static void test() {
		MyList<Integer> list = new MyList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list.size());
		System.out.println(list.getElementAt(4));
		list.print();
	}
}
