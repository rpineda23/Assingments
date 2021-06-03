
public class Day2_5 {
	public static void main(String[] args) {
        int number = 3, p = 3;
        long result = 1;
        
        for (int i = p;i != 0; --i){
            result *= number;
        }
        
        System.out.println(number+"^"+p+" = "+result);
    }
}