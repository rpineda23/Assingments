@FunctionalInterface
interface PrintNumber{
	public void print(int num1);
}

public class Day3_10{
	public static void main(String[] a) {
		PrintNumber p = n -> System.out.println("square is: "+ n*n);
		p.print(5);
	}
}