package org.dimigo.algorithm;

import java.util.Scanner;

public class Divide_And_Conquer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(pow(a, b));
        System.out.println(pow2(a, b));
    }

    //반복문으로 구현
    private static int pow(int a, int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) r *= a;
        return r;
    }

    //재귀함수로 구현
    private static int pow2(int a, int n) {
        if (n == 0) return 1;
        else return a * pow2(a, n - 1);
    }

}
