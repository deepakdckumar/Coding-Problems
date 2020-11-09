import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] firstNumbers = scan.nextLine().split(" ");
		int numberOfScores = Integer.parseInt(firstNumbers[0]);
		int placeScore = Integer.parseInt(firstNumbers[1]);
		String[] secondNumbers = scan.nextLine().split(" ");
		int minimumScore = Integer.parseInt(secondNumbers[placeScore - 1]);
		scan.close();
		int count = 0;
		for(int i = 0; i < secondNumbers.length; i++) {
			int numberToCheck = Integer.parseInt(secondNumbers[i]);
			if(numberToCheck >= minimumScore && numberToCheck > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
