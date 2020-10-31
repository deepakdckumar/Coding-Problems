import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextInt() * 2);
		scan.nextLine();
		System.out.println(scan.nextLine());
		scan.close();
	}
}
