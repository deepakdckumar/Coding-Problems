import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int start = scan.nextInt();
		int end = scan.nextInt();
		for(int i = start; i < end; i++) {
			System.out.print(text.charAt(i));
		}
		scan.close();
	}
}
