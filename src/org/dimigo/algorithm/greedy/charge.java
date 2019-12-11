package org.dimigo.algorithm.greedy;

import java.util.Scanner;

public class charge {
    static int n, len;
    static int ans = Integer.MAX_VALUE;
    static int[] coin;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        len = s.nextInt();
        coin = new int[len];
        for (int i=0; i<len; i++) {
            coin[i] = s.nextInt();
        }
        int n = s.nextInt();
        solve(0, 0);
        System.out.println(ans);
    }

    private static void solve(int m, int cnt) {
        if (m > n) return;
        if (cnt > ans) return;
        if (m == n) {
            if (cnt < ans) {
                ans = cnt;
                return;
            }
        }
        for (int i=0; i<len; i++) {
            solve(m+coin[i], cnt+1);
        }
    }
}
