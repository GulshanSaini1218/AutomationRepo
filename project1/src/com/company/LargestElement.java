package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LargestElement {

    public  static void main(String[] args){
    int a[] = new int[] {56,78,456,789,89,90};
    int max = a[0];
    for (int i=1; i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
        System.out.println("Largest Element in an Array " +max);

    }

}
