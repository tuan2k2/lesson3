package com.basic.lesson4.ForWhile;

import java.util.Scanner;

public class Sentence5 {
    public static void main(String[] args) {
        int Number = EnterNumber();
        if (Number < 2) {
            System.out.println("Invalid input");
        }
        for (int i = 1; i <= Number; i++) {
            if (Check(i)) {
                System.out.printf("%d  " , i);
            }
        }
    }
    public static int EnterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int Number = sc.nextInt();
        return Number;
    }
    public static boolean Check(int Number) {
        int d = 0;
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                d = d + 1;
            }
        }
        if (d == 2) {
            return true;
        } else {
            return false;
        }
    }
}
