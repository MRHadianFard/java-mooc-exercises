
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            } else {
                spiltStrings(string);
            }
        }

    }

    private static void spiltStrings(String string) {
        String[] splitted = string.split(" ");
        for (String word : splitted) {
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
    }
}
