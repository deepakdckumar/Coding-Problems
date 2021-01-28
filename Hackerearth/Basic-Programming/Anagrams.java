import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		scan.nextLine();
		while(numberOfTest > 0) {
			String firstText = scan.nextLine(), secondText = scan.nextLine();
			Set<Character> set = new HashSet<>();
			set.clear();
			int count = 0;
			for(int i = 0; i < firstText.length(); i++) {
				int countFirst = 0;
				int secondCount = 0;
				char firstChar = firstText.charAt(i);
			if(!set.contains(firstChar)) {
				for(int j = 0; j < firstText.length(); j++) {
					if(firstText.charAt(j) == firstChar) {
						countFirst++;
					}
				}
				for(int k = 0; k < secondText.length(); k++) {
					if(secondText.charAt(k) == firstChar) {
						secondCount++;
					}
				}
				if(countFirst > secondCount) {
					count += countFirst - secondCount;
				}
				else {
					count += secondCount - countFirst;
				}
			}}
			System.out.println((firstText.length() + secondText.length()) - count);
			numberOfTest--;
		}
		scan.close();
	}
}
