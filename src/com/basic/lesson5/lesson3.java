package com.basic.lesson5;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        enter();
    }
    public static void enter(){
        int [] a;
        int m;
        int k,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element of the array:");
        m = sc.nextInt();
        a = new int[m+1];
        for(int i = 0; i< m; i++){
            System.out.printf(" a[%d]= " , i);
            a[i] = sc.nextInt();
        }
        int [] b ={100};
        System.out.print("  Array before insert: \n ");
        for(int i = 0; i< m; i++ ) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" \n enter the location to insert: ");
        k = sc.nextInt();
        insert(a,b,m,k);
        print(a);
        System.out.println(" \n enter the location to delete: ");
        h = sc.nextInt();
        delete(a,m,h);
    }

    public static void insert(int[]a, int[] b, int m, int k ){
            for(int i= a.length-1; i>= b.length+k; i-- )
                a[i] = a[i-b.length];
            for(int i = k; i<k+b.length; i++  ){
                a[i] = b[i-k];
            }
    }
    public static void delete(int[] a, int m, int h ) {
        for(int i=h;i<m-1;i++)
        {
            a[i]=a[i+1];
        }
        m = m-1;
        System.out.println("array after insert:");
        for(int i =0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void print(int[]a){
        System.out.println(" array after insert: ");
        for(int i = 0; i< a.length; i++ ) {
            System.out.print(a[i] + " ");
        }
    }
}
