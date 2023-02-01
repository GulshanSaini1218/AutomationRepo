package com.company;

public class palindrome {
    public static void main(String[] args){

        String s = "saras", reverseStr = "";



        for (int i = s.length() - 1; i >=0; --i) {
            reverseStr = reverseStr + s.charAt(i);
        }

        if (s.equals(reverseStr)) {
            System.out.println(s + " is a Palindrome String.");
        }
        else {
            System.out.println(s + " is not a Palindrome String.");
        }
    }
}
