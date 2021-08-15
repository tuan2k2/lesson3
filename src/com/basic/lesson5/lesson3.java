package com.basic.lesson5;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        enter();
    }
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        int[] A = {4, 7, 8, 1, 5, 19, 11, 0, 0, 0};
        System.out.println("mang truoc khi thay doi: ");
        for (int i=0 ; i<10 ; i++) {
            System.out.print( A[i] + " ");
        }
        System.out.println("nhap vi tri thay doi:");
        int k = sc.nextInt();
        System.out.println("nhap gia tri thay doi:");
        int value = sc.nextInt();
        insert(A,k,value);
        System.out.println("nhap vi tri thay doi:");
        int d= sc.nextInt();

    }
    public static void insert(int [] A , int k , int value){
        for (int i = 9 ; i > k ; i--  ){
            A[i] = A[i-1];
        }
        A[k]=value;
        System.out.print("\n mang sau khi thay doi:");
        for (int i=0 ; i<10 ; i++){
            System.out.println(A[i] + " ");
        }
    }
}
