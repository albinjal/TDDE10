package myutil_tests;
import myutil.BaseList;
import myutil.MyList;

public abstract class TestList {

	public static void test() {
		boolean works = true;
		BaseList<Integer> list = new MyList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		if (list.size() != 7) {
			System.out.print("MyList.size() ERROR");
			works = false;

		}
		if (list.getElementAt(4) != 3) {
			System.out.print("MyList.getElementAt() ERROR");
			works = false;
		}
		list.print();
		if (!works) {
			System.out.print("MyList doesn't work");
		}
		else {
			System.out.print("MyList works");

		}
	}
}
