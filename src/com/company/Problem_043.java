package com.company;

import java.util.Scanner;

public class Problem_043 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(a+" "+b);

    }
}
