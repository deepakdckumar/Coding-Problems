import java.util.Scanner;

public class LuckyFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		while(numberOfElements > 0) {
			int number = scan.nextInt();
			int count = 0;
			while(number > 0) {
				if((number % 10) == 4) {
					count++;
				}
				number /= 10;
			}
			System.out.println(count);
			numberOfElements--;
		}
		scan.close();
	}
}
