package com.basic.lesson6;

import java.util.Scanner;

public class Sentence4 {
    public static void main(String[] args) {
        int number = enterNumber();
        if (number < 2) {
            System.out.println("Invalid input");
        }
        int dem=0;
        int i=2;
        System.out.println(" The first " + number + " prime number are: ");
        while (dem<number){
            if (checkPrime(i)){
                System.out.printf(" %d ",i);
                dem=dem+1;
            }
            i=i+1;
        }
        System.out.println(" \n The first " + number + " fibonacci number are:") ;
        checkFibonacci(number);
    }
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int number = sc.nextInt();
        return number;
    }
    public static boolean checkPrime(int number) {
        int d = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                d = d + 1;
            }
        }
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkFibonacci(int number){
        int numberOne =1;
        int numberTwo = 0;
        int tg;
        while (number>0) {
            tg = numberOne;
            numberOne = numberOne + numberTwo;
            numberTwo = tg;
            number = number-1;
            System.out.printf(" %d " ,numberTwo);
        }
    }
}
