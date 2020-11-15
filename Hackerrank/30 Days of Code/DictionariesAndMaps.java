import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DictionariesAndMaps {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();	
		scan.nextLine();
		Map<String, Integer> contactDetails = new HashMap<String, Integer>();
		while(numberOfTest > 0) {
			String[] details = scan.nextLine().split(" ");
			contactDetails.put(details[0], Integer.parseInt(details[1]));
			numberOfTest--;
		}	
		while(scan.hasNext()) {
			String key = scan.nextLine();
			if(contactDetails.get(key) == null) {
				System.out.println("Not Found");
			}
			else {
				System.out.println(key + "=" + contactDetails.get(key));
			}
		}
		scan.close();
	}
}
