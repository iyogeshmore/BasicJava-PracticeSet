package com.JavaBasicPracticeSet;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main (String[] args){
        int num;

        System.out.println("Enter Number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even.");
        }
            else{
                System.out.println("Number is Odd.");
            }
        }
    }