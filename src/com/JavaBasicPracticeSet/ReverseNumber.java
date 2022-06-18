package com.JavaBasicPracticeSet;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num , rev = 0,remainder , enterNumber;
        System.out.println("Enter The Number You Want To Reverse: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        enterNumber = num;
        while (num > 0){
            remainder = num%10;
            rev = rev*10+remainder;
            num = num/10;
        }
        System.out.println(enterNumber +" Reverse Number Is: "+rev);
    }
}
