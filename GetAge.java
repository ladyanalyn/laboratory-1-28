package getage;
import java.util.Scanner;

public class GetAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        int age = currentYear - birthYear;
        
        System.out.println("You are " + age + " years old.");
        
        scanner.close();
    }
}

  
