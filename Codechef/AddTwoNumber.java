import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalNumber = scan.nextInt();
		scan.nextLine();
		while(totalNumber > 0) {
			String[] numbers = scan.nextLine().split(" ");
			int firstNumber = Integer.parseInt(numbers[0]);
			int secondNumber = Integer.parseInt(numbers[1]);
			System.out.println(firstNumber + secondNumber);
			totalNumber--;
		}
		scan.close();
	}
}
