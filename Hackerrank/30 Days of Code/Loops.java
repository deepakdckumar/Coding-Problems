import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		scan.close();
	}
}
