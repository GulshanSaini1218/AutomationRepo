package com.company;
import java.io.*;
import java.lang.*;
import java.util.*;




    class one {
        public void print_hello()
        {
            System.out.println("Hello");
        }
    }

    class two extends one {
        public void print_everyone()
        {
            System.out.println("Everyone");
        }
    }

    class three extends two {
        public void print_goodmorning()
        {
            System.out.println("Good Morning");
        }
    }

    // Drived class
    public class multilevelinheritance  {
        public static void main(String[] args)
        {
            three g = new three();
            g.print_hello();
            g.print_everyone();
            g.print_goodmorning();
        }
    }

