import java.util.Scanner;

public class FirstAndLastDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		scan.nextLine();
		while(numberOfElements > 0) {
			String number = scan.nextLine();
			int firstDigit = Integer.parseInt(String.valueOf(number.charAt(0)));
			int secondDigit = Integer.parseInt(String.valueOf(number.charAt(number.length()-1)));
			System.out.println(firstDigit + secondDigit);
			numberOfElements--;
		}
		scan.close();
	}
}
