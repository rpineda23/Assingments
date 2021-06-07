import java.util.ArrayList;
import java.util.Collections;

public class Day3_1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		System.out.println(list);
		Collections.swap(list,1,2);
		System.out.println(list);
	}

}
