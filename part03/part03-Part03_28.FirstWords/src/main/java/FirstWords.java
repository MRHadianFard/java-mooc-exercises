
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            } else {
                splitString(string);
            }
        }
        

    }

    private static void splitString(String string) {
        String[] splitted = string.split(" ");
        System.out.println(splitted[0]);
    }
}
