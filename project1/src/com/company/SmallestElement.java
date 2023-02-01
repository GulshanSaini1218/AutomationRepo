package com.company;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        int a[] = new int[] {56,78,456,789,89,90};
        int min = a[0];
        for (int i=1; i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Smallest Element in an Array " +min);

    }
}
