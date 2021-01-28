import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args)	{
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		while(numberOfTest > 0) {
			int firstNumber = scan.nextInt(), secondNumber = scan.nextInt(), thirdNumber = scan.nextInt();
			if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
				if(secondNumber > thirdNumber) {
					System.out.println(secondNumber);
				}
				else {
					System.out.println(thirdNumber);
				}
			}
			else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
				if(firstNumber > thirdNumber) {
					System.out.println(firstNumber);
				}
				else {
					System.out.println(thirdNumber);
				}
			}
			else if(firstNumber >= secondNumber) {
				System.out.println(firstNumber);
			}
			else {
				System.out.println(secondNumber);
			}	
			numberOfTest--;
		}
		scan.close();
	}
}
