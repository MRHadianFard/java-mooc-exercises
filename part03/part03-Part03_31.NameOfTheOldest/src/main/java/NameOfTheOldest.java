
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (true) {            
            String nameAge = scanner.nextLine();
            if (nameAge.equals("")) {
                break;
            }
            String[] human = spliter(nameAge);
            if (Integer.valueOf(human[1]) > oldest) {
                oldest = Integer.valueOf(human[1]);
                oldestName = human[0];
            }
        }
        System.out.println(oldestName);

    }

    private static String[] spliter(String nameAge) {
        String[] splited = nameAge.split(",");
        
        return splited;
    }
}
