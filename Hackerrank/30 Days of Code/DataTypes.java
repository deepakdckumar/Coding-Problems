import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 4;
		double d = 4.0;
		String s = "Hackerrank ";
		System.out.println(i + scan.nextInt());
		System.out.println(d + scan.nextDouble());
		System.out.println(scan.nextLine() + s + scan.nextLine());
		scan.close();
	}
}
