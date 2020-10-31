import java.util.Scanner;

public class EnormousInputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		int firstNumber = Integer.parseInt(numbers[0]);
		int secondNumber = Integer.parseInt(numbers[1]);
		int count = 0;
		while(firstNumber > 0) {
			if(scan.nextInt() % secondNumber == 0) {
				count++;
			}
			firstNumber--;
		}
		System.out.println(count);
		scan.close();
	}
}
