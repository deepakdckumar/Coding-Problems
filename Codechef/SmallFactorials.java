import java.util.Scanner;

public class SmallFactorials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements =  scan.nextInt();
		while(numberOfElements > 0) {
			int number = scan.nextInt();
			int fact = 1;
			for(int i = 1; i <= number; i++) {
				fact *= i;
			}
			System.out.println(fact);
			numberOfElements--;
		}
	}
}
