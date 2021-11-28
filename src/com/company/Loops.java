package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start value : ");
        int start = sc.nextInt();
        System.out.println("Enter ending value : ");
        int end = sc.nextInt();

        int count = 0;
        for (int i=start;i<=end; i++) {
            if (i % 2 == 0)
                count++;
        }

    }
}
