import java.util.Scanner;

public class StdinStdoutII {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		double decimalNumber = scan.nextDouble();
		scan.nextLine();
		String text = scan.nextLine();
		scan.close();
		System.out.println("String: " + text + "\nDouble: " + decimalNumber + "\nInt: " + number);
	}
}
