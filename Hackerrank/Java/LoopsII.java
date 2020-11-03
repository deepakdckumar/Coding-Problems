import java.util.Scanner;

public class LoopsII {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.nextLine();
		while(number > 0) {	
			String[] numberSeries = scan.nextLine().split(" ");
			int firstNumber = Integer.parseInt(numberSeries[0]);
			int secondNumber = Integer.parseInt(numberSeries[1]);
			int thirdNumber = Integer.parseInt(numberSeries[2]);
			double result = firstNumber + Math.pow(2, 0) * secondNumber;
			for(int i = 1; i <= thirdNumber; i++) {
				System.out.printf("%.0f ", result);
				result += Math.pow(2, i) * secondNumber;
			}
			System.out.println();
			number--;
		}
		scan.close();
	}
}
