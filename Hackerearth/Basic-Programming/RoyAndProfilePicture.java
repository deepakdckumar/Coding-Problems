import java.util.Scanner;

public class RoyAndProfilePicture {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dimensionOfPhoto = scan.nextInt();
		int numberOfTest = scan.nextInt();
		scan.nextLine();
		while(numberOfTest > 0) {
			String[] dimensions = scan.nextLine().split(" ");
			int width = Integer.parseInt(dimensions[0]);
			int height = Integer.parseInt(dimensions[1]);
			if(width >= dimensionOfPhoto && height >= dimensionOfPhoto) {
				if(width == height) {
					System.out.println("ACCEPTED");
				}
				else {
					System.out.println("CROP IT");
				}
			}
			else {
				System.out.println("UPLOAD ANOTHER");
			}
			numberOfTest--;
		}
		scan.close();
	}
}
