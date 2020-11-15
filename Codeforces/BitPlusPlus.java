import java.util.Scanner;

public class BitPlusPlus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		scan.nextLine();
		int count = 0;
		while(numberOfTest > 0)	{
			String bitwiseOperator = scan.nextLine();
			if(bitwiseOperator.charAt(0) == '+' || bitwiseOperator.charAt(2) == '+') {
				count++;
			}
			else {
				count--;
			}
			numberOfTest--;
		}
		System.out.println(count);
		scan.close();
	}
}
