package com.company.scanner;
import java.util.Scanner;


public class swap {
    public static void main(String[] args){
        int a;
        int b;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter First Number");
        a = r.nextInt();
        System.out.println("Enyer second Number");
        b = r.nextInt();



        System.out.println("Before swapping : a = " +a);
        System.out.println("b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping : a =" +a);
        System.out.println(" b = " +b);
    }
}
