package com.basic.lesson4.ForWhile;

import java.util.Scanner;

public class Sentence4 {
    public static void main(String[] args) {
        int Number = EnterNumber();
        int dem = Check(Number);
        input(dem);
    }
    public static int EnterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int Number = sc.nextInt();
        return Number;
    }
    public static int Check( int Number){
        int d = 0;
        if (Number < 2) {
            System.out.println("Invalid input");
        }
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                d = d + 1;
            }
        }
        return d;
    }
    public static void input(int dem){
        if (dem==2) {
            System.out.println("is a prime number");
        } else {
            System.out.println("is not a prime number");
        }
    }
}