import java.util.Scanner;

public class Day1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ISBN: ");
		int isbn = scan.nextInt();
		System.out.println("Enter NAME: \n");
		String name = scan.next();
		System.out.print("Enter AUTHOR: \n");
		String author = scan.next();
		System.out.println("Enter PRICE: \n");
		float price = scan.nextFloat();
		System.out.println("Enter # OF COPIES: ");
		int copies = scan.nextInt();
		
		print(isbn,name,author,price,copies);
		
		scan.close();
		
	}
	public static void print(int isbn,String name, String author, float price, int copies) {
		System.out.print("here are your results..." + isbn+" "  +name+" " +author+" " +price+" " +copies);
	}
}
