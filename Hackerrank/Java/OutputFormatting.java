import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for(int i = 0; i < 3; i++) {
			String[] text = scan.nextLine().split(" ");
			String dispText = text[0];
			int number = Integer.parseInt(text[1]);
			System.out.printf("%-15s%03d\n",dispText,number);
		}
		scan.close();
		System.out.println("================================");
	}
}
