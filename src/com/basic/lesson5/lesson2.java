package com.basic.lesson5;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        int[] a = enterArray();
        System.out.println("array after incrementing by 1 unit:");
        increaseAllElements(a);
        int solon = max(a);
        System.out.println(" \n Number Max: " + solon);
        int sobe = min(a);
        System.out.println("Number Min: " + sobe);
        int d= findLocation(a);
        if (d == -1){
            System.out.println("not found");
        } else{
            System.out.println("Location:" +d);
        }
    }

    public static int[] enterArray() {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of the array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void increaseAllElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            System.out.printf(" %d " ,arr[i] );
        }
    }

    public static int max(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int min(int[] arr) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }

        }
        return Min;
    }

    public static int findLocation(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 10) {
                return i;
            }
        }
        return -1;
    }
}
