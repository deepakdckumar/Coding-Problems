import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		for(int i = 0; i < text.length(); i++) {
			int charNumber = (int)text.charAt(i);
			if(charNumber >= 65 && charNumber <= 90) {
				charNumber += 32;
			}
			else {
				charNumber -=32;
			}
			System.out.print((char)charNumber);
		}
	}
}
