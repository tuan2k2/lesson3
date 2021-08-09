package com.basic.lesson4.IfElseSwich;

import java.util.Scanner;

public class Sentence3 {
    public static void main(String[] args) {
        int age = EnterAge();
        WhatAreyou(age);
    }
    public static int EnterAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        return age;
    }
    public static void WhatAreyou(int age){
        if (age < 0) {
            System.out.println("tuoi khong hop le");
        } else if (age >= 0 && age <18 ) {
            System.out.println("tre chou");
        } else if ( age >=18 && age <= 200 ) {
            System.out.println("nguoi lon");
        } else {
            System.out.println("yeu tinh");
        }
    }
}
