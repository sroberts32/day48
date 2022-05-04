package day48.conditional_statements.src;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num == num2) {
            System.out.println("The numbers are equal.");
        } else if (num < num2) {
            System.out.println("The second number was larger.");
        } else {
            System.out.println("The first number was larger.");
        }
        scanner.close();
    }
}
