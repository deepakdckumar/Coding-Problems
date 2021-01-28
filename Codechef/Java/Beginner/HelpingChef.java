import java.util.Scanner;

public class HelpingChef {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTests = scan.nextInt();
		while(numberOfTests > 0) {
			int testNumber = scan.nextInt();
			if(testNumber < 10) {
				System.out.println("Thanks for helping Chef!");
			}
			else {
				System.out.println(-1);
			}
			numberOfTests--;
		}
		scan.close();
	}
}
