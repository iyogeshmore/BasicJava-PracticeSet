package com.JavaBasicPracticeSet;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = scan.nextInt();
        System.out.println("Enter value of b: ");
        b = scan.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Value is a: "+a);
        System.out.println("Value is b: "+b);
    }
}
