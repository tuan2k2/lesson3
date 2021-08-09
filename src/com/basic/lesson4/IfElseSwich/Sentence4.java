package com.basic.lesson4.IfElseSwich;

import java.util.Scanner;

public class Sentence4 {
    public static void main(String[] args) {
        int Day = EnterDay();
        PrintOutTheDay(Day);
    }
    public static int EnterDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one day of the week:");
        int Day = sc.nextInt();
        return Day;
    }
    public static void PrintOutTheDay(int Day){
        switch (Day) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" the number invalid ");
        }

    }
}
