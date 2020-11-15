import java.util.Scanner;

public class TheLeadGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		int firstPlayerScore = 0, firstPlayerMaxScore = 0, firstPlayerTotalScore = 0;
		int secondPlayerScore = 0, secondPlayerMaxScore = 0, secondPlayerTotalScore = 0;
		scan.nextLine();
		while(numberOfTest > 0) {
			String[] scores = scan.nextLine().split(" ");
			int firstScore = Integer.parseInt(scores[0]);
			int secondScore = Integer.parseInt(scores[1]);
			firstPlayerScore += firstScore;
			secondPlayerScore += secondScore;
			int score = firstPlayerScore - secondPlayerScore;
			if(score > 0) {
				if(firstPlayerMaxScore < score) {
					firstPlayerMaxScore = score;
				}
				firstPlayerTotalScore += score;
			}
			else {
				score *= -1;
				if(secondPlayerMaxScore < score) {
					secondPlayerMaxScore = score;
				}
				secondPlayerTotalScore += score;
			}
			numberOfTest--;
		}
		if(firstPlayerTotalScore > secondPlayerTotalScore) {
			System.out.println("1 " + firstPlayerMaxScore);
		}
		else {
			System.out.println("2 " + secondPlayerMaxScore);
		} 
		scan.close();
	}
}
