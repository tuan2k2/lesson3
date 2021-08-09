package com.basic.lesson4.IfElseSwich;

import java.util.Scanner;

public class Sentence1 {
    public static void main(String[] args) {
        int Number = Number();
        Check(Number);
    }
    public static int Number(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number:");
        int Number = sc.nextInt();
        return Number;
    }
    public static void Check( int Number){
        if ( Number % 2 == 0) {
            System.out.println("Is an even number");
        } else {
            System.out.println("Is odd");
        }
    }
}
