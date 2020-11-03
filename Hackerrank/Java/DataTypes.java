import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalNumber = scan.nextInt();
		while(totalNumber > 0) {
			try {
				long numberToCheck = scan.nextLong();
				System.out.println(numberToCheck + " can be fitted in:");
				if(numberToCheck >= Short.MIN_VALUE && numberToCheck <= Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if(numberToCheck >= Byte.MIN_VALUE && numberToCheck <= Byte.MAX_VALUE) {
					System.out.println("* byte");
				}
				if(numberToCheck >= Integer.MIN_VALUE && numberToCheck <=Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				if(numberToCheck >= Long.MIN_VALUE && numberToCheck <=Long.MAX_VALUE) {
					System.out.println("* long");
				}
			} catch(Exception e) {
				System.out.println(scan.next() + "can't be fitted anywhere");
			}
			totalNumber--;
		}
		scan.close();	
	}
}
