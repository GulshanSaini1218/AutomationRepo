package com.company;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args){
        int a[] = new int[] {3,6,8,3,6,9,6,4,9,4,2};
        System.out.println("Duplicate elements in given array");
        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
