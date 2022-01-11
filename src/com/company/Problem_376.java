package com.company;

import java.util.Scanner;

public class Problem_376 {
    // UnknownDev_Java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        if (a <= 12) {
            if (a == 1 | a == 2 | a == 12) System.out.println("Winter");
            if (a == 3 | a == 4 | a == 5) System.out.println("Spring");
            if (a == 6 | a == 7 | a == 8) System.out.println("Summer");
            if (a == 9 | a == 10 | a == 11) System.out.println("Autumn");
        }else System.out.println("Error");

    }
}

