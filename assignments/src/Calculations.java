package day48.assignments.src;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter a number:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());


        int add = num + num2;
        int subtract = num - num2;
        int multiply = num * num2;
        // double dnum = Double.valueOf(num);
        // double dnum2 = Double.valueOf(num2);
        // double divide = dnum / dnum2;
        double divide = (double)num / (double)num2;
        int remainder = num - num2;

        System.out.println(num + " + " + num2 + " = " + add);
        System.out.println(num + " - " + num2 + " = " + subtract);
        System.out.println(num + " * " + num2 + " = " + multiply);
        System.out.println(num + " / " + num2 + " = " + divide);
        System.out.println(num + " % " + num2 + " = " + remainder);
    }
}
