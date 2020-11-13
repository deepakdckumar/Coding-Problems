import java.util.Scanner;

public class IntroToConditionalStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number % 2 != 0) {
			System.out.println("Weird");
		}
		else {
			if(number >= 6 && number <= 20) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
		}
		scan.close();
	}
}
