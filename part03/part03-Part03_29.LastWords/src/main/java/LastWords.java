
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            
            splittedstring(string);
        }

    }

    private static void splittedstring(String string) {
        String[] splitted = string.split(" ");
        System.out.println(splitted[splitted.length - 1]);
    }
}
