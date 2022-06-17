package com.JavaBasicPracticeSet;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Two Numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();

       int c = a+b;
        System.out.println("Sum Of Two Number Is: "+c);
    }
}
