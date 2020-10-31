import java.util.Scanner;

public class StdinStdoutI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 3;
		while(i > 0) {
			System.out.println(scan.nextInt());
			i--;
		}
		scan.close();
	}
}
