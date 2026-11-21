
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String nameAge = scanner.nextLine();

            if (nameAge.equals("")) {
                break;
            }

            int oldestAge = age(nameAge);

            if (oldestAge > oldest) {
                oldest = oldestAge;
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }

    private static int age(String nameAge) {
        String[] splited = nameAge.split(",");

        return Integer.valueOf(splited[1]);
    }
}
