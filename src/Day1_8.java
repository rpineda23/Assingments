import java.util.Scanner;

public class Day1_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		
		if(num >= 0)
			System.out.println("Your number is positive.");
		else
			System.out.println("Your number is negative.");
		
		scan.close();
	}

}
