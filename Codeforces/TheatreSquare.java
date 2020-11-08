import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		long oneSide = Long.parseLong(input[0]);
		long secondSide = Long.parseLong(input[1]);
		long sideOfFlagStone = Long.parseLong(input[2]);
		if(sideOfFlagStone == 1) {
			System.out.println(oneSide * secondSide);
		}
		else {
			long countFirstSide = 0;
			while(oneSide > 0) {
				countFirstSide++;
				oneSide -=sideOfFlagStone;
			}
			long countSecondSide = 0;
			while(secondSide > 0) {
				countSecondSide++;
				secondSide -=sideOfFlagStone;
			}
			System.out.println(countFirstSide * countSecondSide);
		}
	}
}
