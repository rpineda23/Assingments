import java.util.Scanner;

public class Day1_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter from alphabet...");
		char alpha = scan.next().charAt(0);
		
		switch(alpha) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Your character is a vowel.");
			break;
		default:
			System.out.println("Your character is a consonant.");
			break;
		}
		
		scan.close();
	}
}
