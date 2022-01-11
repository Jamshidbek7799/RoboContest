package com.company;

import java.util.Scanner;

public class Problem_082 {
    // UnknownDev_Java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        if (n % 2 == 0 ) {
            System.out.println("Second player");
        }else
            System.out.println("First player");

    }
}

