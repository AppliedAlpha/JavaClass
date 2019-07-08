package org.dimigo.oop;

import java.util.Random;

public class CountTest {
    public static void main(String[] args) {
        int f = new Random().nextInt(50);
        for (int i = 0; i < f; i++) {
            new Count();
        }
        System.out.println(Count.getCnt());
    }
}
