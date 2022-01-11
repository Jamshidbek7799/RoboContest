package com.company;

import java.util.Scanner;

public class Problem_119 {
    // UnknownDev_Java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Long N = sc.nextLong();

        if (N % 4 == 0){
            System.out.println(N/2);
        }
        else
            System.out.println(-1);
    }
}

