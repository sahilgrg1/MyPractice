package com.company.Hello;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Scanner;

class Hello
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        patt(n,1);
    }
    public static void patt(int n , int i)
    {
        if( n < 1 )
        {
            return ;
        }
        if( i <= n )
        {
            System.out.print("*"+"\t");
            patt(n,i+1);
        }
        else
        {
            System.out.println();
            patt(n-1,1);
        }
    }
}