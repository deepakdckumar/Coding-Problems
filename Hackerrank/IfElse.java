import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberToCheck = scan.nextInt();
		scan.close();
		String result;
		if(numberToCheck % 2 !=0) {
			result = "Weird";
		}
		else {
			if(numberToCheck >= 6 && numberToCheck <= 20) {
				result = "Weird";
			}
			else {
				result = "Not Weird";
			}
		}
		System.out.println(result);
	}
}
