import java.util.Scanner;

public class Day1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int first = scan.nextInt();
		System.out.println("Enter second number: ");
		int second = scan.nextInt();
		
		int quotient = first / second;
		int remainder = first % second;
		
		System.out.println("Quotient: "+ quotient);
		System.out.println("Remainder: "+ remainder);
		
		scan.close();
	}

}
