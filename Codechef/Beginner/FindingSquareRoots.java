import java.util.Scanner;

public class FindingSquareRoots {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		while(numberOfTest > 0) {
			long number = scan.nextInt();
			long squareRoot = Math.round(Math.pow(number, 0.5));
			System.out.println(squareRoot);
			numberOfTest--;
		}
		scan.close();
	}
}
