import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String reverseString = "";
		for(int i = 0; i < text.length(); i++) {
			reverseString = text.charAt(i) + reverseString;
		}
		if(text.equals(reverseString)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
