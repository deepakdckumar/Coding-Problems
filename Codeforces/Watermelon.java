import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		if(number % 2 != 0) {
			System.out.println("NO");
		}
		else {
			if(number == 2) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
}
