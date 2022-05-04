package day48.conditional_statements.src;
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number bigger than 212");
        int temp = Integer.valueOf(scanner.nextLine());

        if (temp > 212) {
            System.out.println("Water is boiling!");
        }
        scanner.close();
    }
}
