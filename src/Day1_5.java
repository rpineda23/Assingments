import java.util.Scanner;

public class Day1_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter from alphabet...");
		char alpha = scan.next().charAt(0);
		
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
			System.out.println("Your character is a vowel.");
		else
			System.out.println("Your character is a consonant.");
		
		scan.close();
	}
}
