package com.company;

public class HW {
    public static void main(String[] args){
        HW hw = new HW();
        int a = 10;
        int b = ++a;
        int c = b;
        int d = a--;
        int e = d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        int x = 8;
        int y = 5;
        System.out.println("Addition " + (x+y));
        System.out.println("Multiplication " + (x*y));
        System.out.println("Sbutraction " + (x-y));
        System.out.println("division " + (x/y));
        System.out.println(40<20);
        System.out.println(40>=10 && 10<40);
        System.out.println(40>10 || 10<40);
        int g = (x>y) ? x : y;
        System.out.println(g);
        int h = x << 5;
        System.out.println(h);
    }
}
