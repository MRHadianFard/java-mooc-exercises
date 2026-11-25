import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {            
            String name = scan.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            int pages = Integer.valueOf(scan.nextLine());
            int year = Integer.valueOf(scan.nextLine());
            
            bookList.add(new Book(name, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String information = scan.nextLine();
        
        if (information.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        } else if(information.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getName());
            }
        }
    }
}
