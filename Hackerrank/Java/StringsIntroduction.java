import java.util.Scanner;

public class StringsIntroduction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString = scan.nextLine();
		String secondString = scan.nextLine();
		System.out.println(firstString.length() + secondString.length());
		int firstChar = (int) firstString.charAt(0);
		int secondChar = (int) secondString.charAt(0);
		if(firstChar > secondChar) {
			System.out.println("Yes");		
		}
		else {
			System.out.println("No");		
		}
		for(int i = 0; i < firstString.length(); i++) {
			if(i == 0) {
				System.out.print((char) (firstChar - 32));
			}
			else {
				System.out.print(firstString.charAt(i));
			}
		}
		System.out.print(" ");
		for(int i = 0; i < secondString.length(); i++) {
			if(i == 0) {
				System.out.print((char) (secondChar - 32));
			}
			else {
				System.out.print(secondString.charAt(i));
			}
		}
		scan.close();
	}
}
