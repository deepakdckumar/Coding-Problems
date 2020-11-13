import java.util.Scanner;

public class ClassVsInstances {
	private int age;
	public ClassVsInstances(int initialAge) {
          	if(initialAge < 0) {
              		System.out.println("Age is not valid, setting age to 0.");
              		age = 0;
         	}
          	else {
              		age += initialAge;
		}
	}

	public void amIOld() {
		if(age < 13) {
			System.out.println("You are young.");
		}
		else if(age >= 13 && age < 18) {
              		System.out.println("You are a teenager.");
          	}
          	else if(age >= 18) {
              		System.out.println("You are old.");
          	}
	}

	public void yearPasses() {
		age += 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		while(numberOfElements > 0) {
			int age = scan.nextInt();
			ClassVsInstances person = new ClassVsInstances(age);
			person.amIOld();
			for(int i = 0; i < 3; i++) {
				person.yearPasses();
			}
			person.amIOld();
			System.out.println();
			numberOfElements--;
		}
		scan.close();
	}
}
