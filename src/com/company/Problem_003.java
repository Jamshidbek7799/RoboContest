package com.company;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem_003 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        BigInteger a = in.nextBigInteger();
        BigInteger  b = in.nextBigInteger();

        out.println(b.add(a));

        out.flush();

    }
}
