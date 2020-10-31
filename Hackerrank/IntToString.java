import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String intText = String.valueOf(number);
		if(number == Integer.parseInt(intText)) {
			System.out.println("Good Job!");
		} else {
			System.out.println("Wrong Answer");
		}
	}
}
