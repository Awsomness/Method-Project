package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String aName = theName("Whalter");
        System.out.println("Hello World");
        System.out.println(aName);
        int a,b;
        a=10;
        b=15;
        int answer = multiply(a,b);
        System.out.println(answer);
        int c,d;
        c=1;
        d=5;
        double answer2 = divide(c,d);
        System.out.println(answer2);

    }

        public static String theName(String name){
        return "Hello " + name ;
    }

    public static int multiply (int a, int b){
        return a*b;
    }

    public static double divide (double c, double d){
        return c/d;
    }

    

}

