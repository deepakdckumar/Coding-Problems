import java.util.Scanner;

public class Recursion {
	
	private static int factorial(int number) {
		if(number <= 1) {
			return 1;
		}
		else {
			return number * factorial(number - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int fact = factorial(number);
		System.out.println(fact);
	}
}
