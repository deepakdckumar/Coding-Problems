import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberLine = scan.nextLine();
        scan.close();
        String[] numbers = numberLine.split("[+]");
        List<String> listOfNumbers=new ArrayList<String>(Arrays.asList(numbers));
        Collections.sort(listOfNumbers);
        int count=0;
        for(String num: listOfNumbers) {
            count++;
            System.out.print(num);
            if(listOfNumbers.size() == count) {
                break;
            }
            System.out.print("+");
        }
    }
}
