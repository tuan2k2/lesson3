package com.basic.lesson3;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        String Ten = Name.next();
        // lesson1
        System.out.println("where the character a is: " +Ten.indexOf("a") + " and " + Ten.lastIndexOf("a"));
        //lesson2
        System.out.println(" split string: \n"+Ten.substring(0,3) + "\n" +Ten.substring(3,6)+"\n" +Ten.substring(6,8)+"\n" +Ten.substring(8,12));
        //lesson3
        System.out.println("string concatenation: \n " +Ten.concat("").concat("").concat("").concat(""));
        //lesson4
        System.out.println("Words to get: \n" +Ten.substring(6,12));
        //lesson5
        System.out.println("sentence after replacing: \n" +Ten.replace("toiyeudanang" , "toiyeuhanoi"));
        //lesson6
        System.out.println("this sentence has a empty character: \n "  +Ten.isEmpty());
    }
}
