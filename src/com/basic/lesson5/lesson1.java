package com.basic.lesson5;

import java.util.Scanner;

public class lesson1 {

    public static void main(String[] args) {
        int[] a = enter();
        printArray(a);
        int sum = sum(a);
        sochan(a);
    }
    public static int[] enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sum( int[] arr ) {
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
        return sum;
    }
    public static void sochan( int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
