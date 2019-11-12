package org.dimigo.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class Divide_And_Conquer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        //System.out.println(pow(a, b));
        //System.out.println(pow2(a, b));
        System.out.println(pow3(a, b));
    }

    //반복문으로 구현
    private static BigInteger pow(int a, int n) {
        BigInteger r = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) r = r.multiply(BigInteger.valueOf(a));
        return r;
    }

    //재귀함수로 구현
    private static BigInteger pow2(int a, int n) {
        if (n == 0) return BigInteger.ONE;
        else return pow2(a, n-1).multiply(BigInteger.valueOf(a));
    }

    //Divide And Conquer
    private static BigInteger pow3(int a, int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger t = pow(a, n / 2);
        BigInteger temp = t.multiply(t);
        return (n % 2 == 0) ? temp : temp.multiply(BigInteger.valueOf(a));
    }
}
