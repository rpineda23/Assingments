import java.util.ArrayList;

public class Day3_2 {
	public static void main(String[] args){
        ArrayList<String> list= new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
  

        System.out.println("First ArrayList: " + list);
        ArrayList<String> cloneList = new ArrayList<String>();
        cloneList = (ArrayList)list.clone();
  
        // Displaying the other linked list
        System.out.println("Second ArrayList is: " + cloneList);
    }
}