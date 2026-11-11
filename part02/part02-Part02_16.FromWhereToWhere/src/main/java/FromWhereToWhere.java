
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int toWhere = scanner.nextInt();
        System.out.print("Where from? ");
        int fromWhere = scanner.nextInt();
        if (fromWhere <= toWhere) {
            for (int i = fromWhere; i <= toWhere; i++) {
                System.out.println(i);
            }
        }
    }
}
