import java.util.Scanner;

public class FindProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		long product = 1;
		for(int i = 1; i <= size; i++) {
			product = (long)(product * scan.nextInt()) % (long)(Math.pow(10, 9) + 7);
		}
		System.out.println(product);
		scan.close();
	}
}
