package day48.conditional_statements.src;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a test score between 0 and 100:");
        int score = Integer.valueOf(scanner.nextLine());
        
        switch (score/10) {
            case 10:
                System.out.println("Perfect score! A+");
                break;
            case 9: 
              System.out.println("You got an A!");
              break;
            case 8:
              System.out.println("You got a B.");
              break;
            case 7:
              System.out.println("You got a C");
              break;
            case 6:
              System.out.println("You got a D");
              break;
            default:
              System.out.println("You got an F.");
              break;

          }
        scanner.close();
    }
}