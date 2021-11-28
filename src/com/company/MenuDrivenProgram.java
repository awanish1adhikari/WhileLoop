package com.company;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        System.out.println("Menu Driven Program");
        System.out.println("-------------------");
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Simple Interest");
        System.out.println("3. Palindrome Number");
        System.out.println("4. Odd Even");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1,2,3,4) : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter first number :");
                int first = sc.nextInt();
                System.out.println("Enter second number :");
                int second = sc.nextInt();
                System.out.println("Sum is : " + (first+second));
                break;
            case 2:
                System.out.println("Enter P :");
                float P = sc.nextFloat();
                System.out.println("Enter R :");
                float R = sc.nextFloat();
                System.out.println("Enter T :");
                float T = sc.nextFloat();
                System.out.println("Simple Interest is : " + (P*T*R/100));
                break;
            case 3:
                System.out.println("Enter a number : ");
                int num = sc.nextInt();
                int rem = num % 10;
                int quot = num / 10;
                int result = rem * 10 + quot;

                if (result == num)
                    System.out.print(num + "is a palindrome");
                else
                    System.out.print(num + "is not a palindrome");
                break;
        }
    }
}
