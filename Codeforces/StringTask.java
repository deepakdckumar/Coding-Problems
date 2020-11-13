import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String testText = scan.nextLine();
		scan.close();
		String consonantsTest = "";
		for(int i = 0; i < testText.length(); i++) {
			char testChar = testText.charAt(i);
			if(testChar == 'a' || testChar == 'A' || testChar == 'e' || testChar == 'E' || testChar == 'i' || testChar == 'I' || testChar == 'o' || testChar == 'O' || testChar == 'u' || testChar == 'U' || testChar == 'y' || testChar == 'Y') {
				continue;
			}
			else {
				int testCharCase = (int)testChar;
				if(testCharCase >= 65 && testCharCase <= 90) {
					testCharCase+=32;
				}
				consonantsTest += (char)testCharCase;
			}
		}
		for(int i = 0; i<consonantsTest.length(); i++) {
			System.out.print("."+consonantsTest.charAt(i));
		}
	}
}
