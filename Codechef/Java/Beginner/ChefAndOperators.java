import java.util.Scanner;

public class ChefAndOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		while(numberOfTest > 0) {
			int firstNumber = scan.nextInt(), secondNumber = scan.nextInt();
			if(firstNumber > secondNumber) {
				System.out.println(">");
			}
			else if(firstNumber < secondNumber) {
				System.out.println("<");
			}
			else {
				System.out.println("=");
			}
			numberOfTest--;
		}
		scan.close();
	}
}
