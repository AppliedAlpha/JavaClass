package org.dimigo.algorithm;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(fibo(a));
    }

    private static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
