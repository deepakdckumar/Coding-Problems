import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int[] intArray = new int[numberOfElements];	
		for(int i = 0; i < numberOfElements; i++) {
			intArray[i] = scan.nextInt();
		}
		for(int i = numberOfElements - 1; i >= 0; i--) {
			System.out.print(intArray[i] + " ");
		}
		scan.close();
	}
}
