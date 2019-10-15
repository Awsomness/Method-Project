package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String aName = theName("Whaler");
        System.out.println("Hello World");
        System.out.println(aName);
        int a,b;
        a=10;
        b=15;
        int answer = multiply(a,b);
        System.out.println(answer);

    }

        public static String theName(String name){
        return "Hello" + name ;
    }

    public static int multiply (int a, int b){
        return a*b;
    }

    

}

