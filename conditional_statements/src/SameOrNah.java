package day48.conditional_statements.src;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String str = scanner.nextLine();
        
        System.out.println("Enter another word:");
        String str2 = scanner.nextLine();

        if (str.equals(str2)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }
        scanner.close();
    }
}
