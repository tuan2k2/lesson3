package com.basic.lesson6;

import java.util.Scanner;

public class Sentence2 {
    public static void main(String[] args) {
        int a = enterNumber();
        int b = enterNumber();
        int ucln=greatestCommomDivisor(a,b);
        System.out.println("Greatest common divisor of two number: \n" + a + " and " + +b +" : " +ucln);
    }
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int Number = sc.nextInt();
        return Number;
    }
    public static int greatestCommomDivisor( int a , int b){
        int n;
        while (b!=0) {
            n = a % b;
            a = b;
            b=n;
        }
        return a;
    }
}