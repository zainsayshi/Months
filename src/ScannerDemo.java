/**
 * class : Scanner Demo
 * @written on : August 28, 2023
 *
 */
import java.util.Scanner;//this will allow the program scan date
public class ScannerDemo {
    public static void main(String[] args)
        java.util.Scanner zain = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = zain.nextline(); //zain.next();

        String greetings = "Hello, ";
        //System.out.println(greetings + name);
        int age = zain.nextInt();
}
