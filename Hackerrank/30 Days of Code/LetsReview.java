import java.util.Scanner;

public class LetsReview {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		scan.nextLine();
		while(numberOfTest > 0) {
			String text = scan.nextLine();
			String oddText = "", evenText = "";
			for(int i = 0; i < text.length(); i++) {
				if(i % 2 == 0) {
					evenText += text.charAt(i);
				}
				else {
					oddText += text.charAt(i);
				}
			}
			System.out.println(evenText + " " + oddText);
			numberOfTest--;
		}
		scan.close();
	}
}
