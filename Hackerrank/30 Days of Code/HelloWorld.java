import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, World!\n" + scan.nextLine());
		scan.close();
	}
}