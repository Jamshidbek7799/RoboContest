package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();

        Long cnt = A+B+C;

        System.out.println(cnt>=N?"Yes":"No");

    }
}
