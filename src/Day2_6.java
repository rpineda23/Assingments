
public class Day2_6 {
	public static void main(String[] args) {
        double[] arr = {20, 23.99, 16.5, 105, 72.8};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }

        double average = total / arr.length;
        System.out.format("The average is: %.3f", average);
    }
}