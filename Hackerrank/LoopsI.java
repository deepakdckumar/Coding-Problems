import java.util.Scanner;

public class LoopsI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		for(int i = 1; i < 11; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}
}
