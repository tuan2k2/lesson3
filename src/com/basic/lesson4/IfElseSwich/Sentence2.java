package com.basic.lesson4.IfElseSwich;

import java.util.Scanner;

public class Sentence2 {
    public static void main(String[] args) {
        double NumberOne = NumberOne();
        double NumberTwo = NumberTwo();
        Compare(NumberOne,NumberTwo);
    }
    public static double NumberOne(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numberOne: ");
        double a = scan.nextDouble();
        return a;
    }
    public static double NumberTwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numberTwo:");
        double b = scan.nextDouble();
        return b;
    }
    public static void Compare(double a, double b){
        if (a >= b) {
            System.out.println("the largest number is " +a);
        } else {
            System.out.println("the largest number is " +b);
        }
    }
}
