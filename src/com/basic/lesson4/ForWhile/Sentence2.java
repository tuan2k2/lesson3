package com.basic.lesson4.ForWhile;

import java.util.Scanner;

public class Sentence2 {
    public static void main(String[] args) {
        int Number = EnterNumber();
        MultiplicationTable(Number);
    }
    public static int EnterNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Number: ");
        int Number = scan.nextInt();
        return Number;
    }
    public static void MultiplicationTable(int Number){
        for (int i=1 ; i<=10 ; i++){
            System.out.printf(" %d * %d = %d \n" ,Number,i,Number*i);
        }
    }
}
