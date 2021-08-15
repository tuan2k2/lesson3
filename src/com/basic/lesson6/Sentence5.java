package com.basic.lesson6;

import java.util.Scanner;

public class Sentence5 {
    public static void main(String[] args) {
        int Number = enterNumber();
        tinh(Number);
    }
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int Number = sc.nextInt();
        return Number;
    }
    public static void tinh(int Number) {
        int i=2;
        if (Number < 2) {
            System.out.println(" Retype:");
        } else {
            while (Number > 1) {
                if (Number % i == 0){
                    System.out.printf(" %d " , i);
                    if (Number!=i) {
                        System.out.print("*");
                    }
                    Number = Number/i;
                } else {
                    i=i+1;
                }
            }
        }
    }
}
