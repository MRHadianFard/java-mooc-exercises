
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        
        String m1 = scanner.nextLine();
        
        System.out.println("What is their job?");
        
        String m2 = scanner.nextLine();
        
        System.out.println("Here is the story:\n" +
"Once upon a time there was " + m1 + ", who was " + m2+ ".\n" +
"On the way to work, " + m1 + " reflected on life.\n" +
"Perhaps " + m1 + " will not be " + m2 +" forever.");


    }
}
