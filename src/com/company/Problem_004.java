package com.company;

import java.io.PrintWriter;
import java.util.Scanner;
public class Problem_004 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Long a = in.nextLong();
        Long b = in.nextLong();

        out.println(b*a);

        out.flush();

    }
}
