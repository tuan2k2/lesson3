package com.basic.lesson4.ForWhile;

import java.util.Scanner;

public class Sentence1 {
    public static void main(String[] args) {
        int N = EnterN();
        int sum = sum(N);
        System.out.println("total = " +sum);
    }
    public static int EnterN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        return N;
    }
    public static int sum( int N){
        int sum = 0;
        for (int i=1 ; i <= N ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
