package com.company.Hello;

import java.util.Scanner;

class Dynamic
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        patt(n);
    }
    public static void patt(int n)
    {
        for (int row = 1; row <= n  ; row++) {
            for (int col = 0; col <= n - row  ; col++) {
                System.out.print(" ");

            }
            if(row == 1 || row == n )
            {
                for (int col = 1; col <= n  ; col++) {
                    System.out.print("*");

                }
            }
            else
            {
                for (int col = 1; col <= n  ; col++) {
                    if(col == 1 || col == n )
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
    }
}