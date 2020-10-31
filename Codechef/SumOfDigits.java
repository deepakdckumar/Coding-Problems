import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalNumbers = scan.nextInt();
		while(totalNumbers > 0) {
			int number = scan.nextInt();
			int sum = 0;
			while(number > 0) {
				sum += number % 10;
				number /=10;
			}
			System.out.println(sum);
			totalNumbers--;
		}
		scan.close();
	}
}
