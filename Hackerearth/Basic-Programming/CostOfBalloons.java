import java.util.Scanner;
 
public class CostOfBallons {
    public static void main(String args[] ) throws Exception {
	   	Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i<=numberOfElements; i++) {
			String[] price = scan.nextLine().split(" ");
			int firstB, secondB;
			if(i % 2 == 0) {
				secondB = Integer.parseInt(price[0]);
				firstB = Integer.parseInt(price[1]);
			}
			else {
				firstB = Integer.parseInt(price[0]);
				secondB = Integer.parseInt(price[1]);
			}
			int numberOfPeople = scan.nextInt();
            		scan.nextLine();
			int totalPrice = 0;
			while(numberOfPeople > 0) {
				String[] result = scan.nextLine().split(" ");
				int firstResult = Integer.parseInt(result[0]);
				int secondResult = Integer.parseInt(result[1]);
				if(firstResult == 1) {
					totalPrice += firstB;
				}
				if(secondResult == 1) {
					totalPrice += secondB;
				}
				numberOfPeople--;
			}
			System.out.println(totalPrice);
		}
        	scan.close();
       }
}
