package com.company;

import java.util.Scanner;

public class Problem_372 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if (A>B && A>C) System.out.println(A);
        if (B>C && B>A) System.out.println(B);
        if (C>A && C>B) System.out.println(C);

    }
}

