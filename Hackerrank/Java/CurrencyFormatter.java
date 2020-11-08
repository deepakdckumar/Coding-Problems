import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();
		scan.close();
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
	}
}
