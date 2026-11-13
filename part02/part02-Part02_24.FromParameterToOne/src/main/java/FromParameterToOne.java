

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne (int num) {
        for (int i = num; 1 <= i; i--) {
            System.out.println(i);
        }
    }

}
