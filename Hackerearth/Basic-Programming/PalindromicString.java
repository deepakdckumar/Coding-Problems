import java.util.Scanner;

public class PalindromicString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String reverseText = "";
		for(int i = text.length() - 1; i >= 0; i--) {
			reverseText = reverseText + text.charAt(i);
		}
		if(text.equals(reverseText)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		scan.close();
	}
}	
