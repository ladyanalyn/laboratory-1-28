package name.age;
import java.util.Scanner;

public class NameAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, my name is Lady Analyn M. Falcon and i am " + age + " years old.");
        scanner.close();
        
    }
    
}
