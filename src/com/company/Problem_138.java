package com.company;

import java.util.Scanner;

public class Problem_138 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n =sc.nextLong();
        Long cnt = ((n*n*n*n*n) + 8 * (n*n*n*n) - 5 * (n*n*n) + 3 * (n*n) + n - 12);

        System.out.println(cnt);

    }
}

