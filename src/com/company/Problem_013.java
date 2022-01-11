package com.company;

import java.util.Scanner;

public class Problem_013 {
    // UnknownDev_Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N == 0){
            System.out.println(1);
        }else {
            System.out.println(1+K);
        }
    }
}
