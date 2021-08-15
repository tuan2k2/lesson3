package com.basic.lesson6;

import java.util.Scanner;

public class Sentence1 {
    public static void main(String[] args) {
        int Number = enterNumber();
        if (Number < 2) {
            System.out.println("Invalid input");
        }
        for (int i = 2; i < Number; i++) {
            if (check(i)) {
                System.out.printf("%d  ", i);
            }
        }
    }
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int Number = sc.nextInt();
        return Number;
    }
    public static boolean check(int Number) {
        int d = 0;
        for (int i = 2; i <= Math.sqrt(Number); i++) {
            if (Number % i == 0) {
                d = d + 1;
            }
        }
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }
}
