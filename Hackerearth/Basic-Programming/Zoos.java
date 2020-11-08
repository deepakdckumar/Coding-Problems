import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		int numberOfZs = 0, numberOfOs = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'z') {
				numberOfZs++;
			}
			else if(text.charAt(i) == 'o') {
				numberOfOs++;
			}
		}
		if((2 * numberOfZs) == numberOfOs) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
