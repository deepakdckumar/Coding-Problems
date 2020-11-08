import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfProblems = scan.nextInt();
		scan.nextLine();
		int count = 0;
		while(numberOfProblems > 0) {
			String[] numbers = scan.nextLine().split(" ");
			int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
			if(sum > 1) {
				count++;
			}
			numberOfProblems--;
		}
		scan.close();
		System.out.println(count);
	}
}
