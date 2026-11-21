
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        String longestName = "";
        while (true) {            
            String nameBrith = scanner.nextLine();
            if (nameBrith.equals("")) {
                break;
            }
            String[] splited = spliter(nameBrith);
            if (splited[0].length() > longestName.length()) {
                longestName = splited[0];
            }
            sum += Integer.valueOf(splited[1]);
            ++count;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sum / count));
    }

    private static String[] spliter(String nameBrith) {
        String[] parts = nameBrith.split(",");
        
        return parts;
    }
}
