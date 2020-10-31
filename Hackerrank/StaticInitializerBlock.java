import java.util.Scanner;

public class StaticInitializerBlock {
	static int breadth, height;
	static boolean flag;
	static {
		Scanner scan = new Scanner(System.in);
		breadth = scan.nextInt();
		height = scan.nextInt();
		scan.close();
		flag = !(breadth <= 0 || height <= 0);
		if(!flag) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}	

	public static void main(String[] args) {
		if(flag) {
			System.out.println(breadth * height);
		}
	}
}
		
