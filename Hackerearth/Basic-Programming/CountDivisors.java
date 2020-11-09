import java.util.Scanner;

public class CountDivisors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		scan.close();
		int firstNumber = Integer.parseInt(numbers[0]);
		int secondNumber = Integer.parseInt(numbers[1]);
		int thirdNumber = Integer.parseInt(numbers[2]);
		int count = 0;
		for(int i = firstNumber; i <= secondNumber; i++) {
			if(i % thirdNumber == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
