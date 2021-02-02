import java.util.Scanner;

public class LifeTheUniverseAndEverything {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(;;) {
            int number=scan.nextInt();
            if(number==42) {
                break;
            }
            System.out.println(number);
        }
        scan.close();
    }
}
