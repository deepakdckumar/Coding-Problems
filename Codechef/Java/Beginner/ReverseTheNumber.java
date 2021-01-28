import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		while(numberOfElements > 0) {
			int numberToCheck = scan.nextInt();
			int reverse = 0;
			while(numberToCheck > 0) {
				reverse = reverse * 10 + numberToCheck % 10;
				numberToCheck /=10;
			}
			System.out.println(reverse);
			numberOfElements--;
		}
		scan.close();
	}
}
