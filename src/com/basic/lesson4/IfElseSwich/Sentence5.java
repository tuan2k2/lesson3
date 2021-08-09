package com.basic.lesson4.IfElseSwich;

import java.util.Scanner;

public class Sentence5 {
    public static void main(String[] args) {
        int Month = EnterMonth();
        PrintOutTheDay(Month);
    }
    public static int EnterMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one month of the year:");
        int Month = sc.nextInt();
        return Month;
    }
    public static void PrintOutTheDay(int Month){
        switch (Month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are thirty-one days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("there are thirty days");
                break;
            case 2:
                System.out.println("have on 28 or 29 days");
                break;
            default:
                System.out.println(" the number invalid ");
        }

    }
}

