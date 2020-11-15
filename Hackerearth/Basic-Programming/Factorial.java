import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int fact = 1;
		if(number == 0) {
			System.out.println(fact);
		}
		else {
			for(int i = number; i > 0; i--) {
				{
					fact *= i;
				}
			}
			System.out.println(fact);
		}
	}
}
