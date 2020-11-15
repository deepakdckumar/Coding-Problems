import java.util.Scanner;

public class PetyaAndStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString = scan.nextLine(), secondString = scan.nextLine();
		boolean flag = true;
		for(int i = 0; i < firstString.length(); i++) {
			int firstStringChar = (int)firstString.charAt(i);
			int secondStringChar = (int)secondString.charAt(i);
			if(firstStringChar != secondStringChar) {
				if(firstStringChar >= 65 && firstStringChar <= 90) {
					firstStringChar += 32;
				}
				if(secondStringChar >= 65 && secondStringChar <= 90){ 
					secondStringChar += 32;
				}
			}
			if(firstStringChar > secondStringChar) {
				System.out.println(1);
				flag = false;
				break;
			}
			else if(firstStringChar < secondStringChar) {
				System.out.println(-1);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(0);
		}
	}
}
											
