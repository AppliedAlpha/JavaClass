package org.dimigo.algorithm.dp;

import java.math.BigInteger;
import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }

    private static BigInteger fibo(int n) {
        BigInteger a, b, c;
        a = BigInteger.ZERO;
        b = BigInteger.ONE;
        for (int i=2; i<=n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
