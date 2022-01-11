package com.company;

import java.util.Scanner;

public class Problem_053 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();

        if (N<3){
            System.out.println(0);
        }else
            System.out.println(N*(N-3)/2);
    }

    }

