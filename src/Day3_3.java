import java.util.LinkedList;
import java.util.Iterator;

public class Day3_3 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("a");
		linkedList.add("b");
        linkedList.add("v");
        linkedList.add("d");
        linkedList.add("e");
		  
        Iterator<String> iterator = linkedList.descendingIterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
		}
    }
}


