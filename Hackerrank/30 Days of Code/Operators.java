import java.util.Scanner;

public class Operators {
	private static void solve(double mealCost, int tipPercent, int taxPercent) {
		double tip = mealCost * (tipPercent / 100.00);
		double tax = mealCost * (taxPercent / 100.00);
		double totalCost = mealCost + tip + tax;
		System.out.println(Math.round(totalCost));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		scan.close();
		solve(mealCost, tipPercent, taxPercent);
	}
}
