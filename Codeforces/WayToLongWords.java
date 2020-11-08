import java.util.Scanner;

public class WayToLongWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfStrings = scan.nextInt();
		scan.nextLine();
		while(numberOfStrings > 0) {
			String text = scan.nextLine();
			if(text.length() > 10) {
				System.out.print(text.charAt(0));
				System.out.print(text.length()-2);
				System.out.println(text.charAt(text.length()-1));
			}
			else {
				System.out.println(text);
			}
			numberOfStrings--;
		}
		scan.close();
	}
}
