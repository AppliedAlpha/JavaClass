package org.dimigo.basic;

public class HelloWorld {
    static boolean flag;
    public static void main(String[] s) {
        long b1 = Long.MIN_VALUE;
        long b2 = Long.MAX_VALUE;
        long b3 = 10000000000l;
        float f1 = 3.14f;
        double d1 = 3.14;
        float f2 = 0.1234567890123456789f;
        double d2 = 0.1234567890123456789;
        //System.out.println(f1 + "\n" + d1 + "\n" + f2 + "\n" + d2);
        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.34, "즐거운 자바");

    }
}
