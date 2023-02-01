package com.company;

import org.w3c.dom.ls.LSOutput;


public class swaptwonumber {
    public  static  void main(String[] args){
        swaptwonumber SwapTwoNumber = new swaptwonumber();
       int x = 10;
      int y = 20;
        System.out.println("Before Swaping : x = " +x);
        System.out.println(" y = " +y);


       x = x + y;
       y = x - y;
       x = x - y;

      System.out.println("After Swaping : x  = " +x);
      System.out.println("y = "+y);



    }

}
