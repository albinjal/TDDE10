package myutil_tests;
import myutil.BaseMap;
import myutil.MyMap;

public abstract class TestMap {

	public TestMap() {
		
		
	}
	
	public static void test() {
		boolean works = true;
		BaseMap<String, Integer> map = new MyMap<String, Integer>();
		map.put("A1", 1);
		map.put("A2", 2);
		map.put("A3", 3);
		map.put("A4", 4);
		
		if (map.size() != 4) {
			System.out.println("Map.size() ERROR");
			works = false;
		}
		
		if (map.get("A3") == 3) {
			System.out.println("Map.get() ERROR");
			works = false;
		}
		if (map.isEmpty() != false) {
			System.out.println("Map.isEpmty() ERROR");
			works = false;
		}
		if (!works) {
			System.out.print("MyMap doesn't work");
		}
		else {
			System.out.print("MyMap works");

		}
	}

}
