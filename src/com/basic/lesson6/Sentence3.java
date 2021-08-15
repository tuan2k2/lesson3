package com.basic.lesson6;

import java.util.Scanner;

public class Sentence3 {
    public static void main(String[] args) {
        int [] A = enterArray();
        System.out.println("Elements appear once:");
        check(A);
    }
    public static int [] enterArray () {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the element of the array: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the value of the array:");
        for (int i = 0; i < number; i++) {
            System.out.printf(" A[%d]= ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void check( int [] A){
        for (int i=0 ; i< A.length ; i++) {
           int dem = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    dem = 1;
                }
            }
            if (dem == 0) {
                System.out.print(A[i] + " ");
            }
            }
        }
    }
