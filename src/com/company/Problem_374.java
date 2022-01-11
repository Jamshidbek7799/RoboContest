package com.company;

import java.util.Scanner;

public class Problem_374 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        int min = 0;

        if (a >= b)
            if (a >= c) {
                max= a;
                if (b >= c)
                    min= c;
                else min= b;
            }
            else {
                max= c;
                min= b;
            }
        else
        if (b >= c) {
            max= b;
            if (a >= c)
                min= c;
            else min= a;
        }
        else {
            max= c;
            if (a >= b)
                min= b;
            else
                min= a;
        }

        System.out.println(max - min);

    }
}

