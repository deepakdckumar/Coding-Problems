import java.util.Scanner;

public class TurboSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int[] intArray = new int[numberOfElements];
		for(int i = 0; i < numberOfElements; i++) {
			intArray[i] = scan.nextInt();
		}
		for(int i = 0; i < numberOfElements - 1; i++) {
			for(int j = 0; j < numberOfElements - i - 1; j++) {
			       if(intArray[j] > intArray[j + 1]) {
				       int temp = intArray[j];
				       intArray[j] = intArray[j + 1];
				       intArray[j + 1] = temp;
			       }
			}
		}
		for(int i = 0; i < numberOfElements; i++) {
			System.out.println(intArray[i]);
		}
		scan.close();
	}
}
