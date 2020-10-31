import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		int firstNumber = Integer.parseInt(numbers[0]);
		double secondNumber = Double.parseDouble(numbers[1]);
		if(firstNumber % 5 == 0 && firstNumber < secondNumber) {
			System.out.printf("%.2f",secondNumber - 0.5 - firstNumber);
		}
		else {
			System.out.println(secondNumber);
		}
		scan.close();
	}
}
