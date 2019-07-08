package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //1. Arithmetic Operator
        int a = 5, b = 2;
        System.out.printf("%d, %d, %d, %d, %d\n", a+b, a-b, a*b, a/b, a%b);
        System.out.println((double)a/b);
//        System.out.println(a/0);

        //2. Arithmetic Operating Of Different Types
        int i = 10;
        double d = 3.14;
        int r1 = (int)(i + d);
        double r2 = i + d;

        short s1 = 1, s2 = 2; //Operating Of Types smaller than int (short, byte ...)
        short r3 = (short)(s1 + s2); //automatically returns int;
        int r4 = s1 + s2;
        System.out.printf("%d %.2f %d %d\n", r1, r2, r3, r4);

        //3. Short-Circuit Test
        boolean flag = true;
        a = 10;
        b = 0;

        if (flag || (a/b == 0)) System.out.println("OR");
        if (!flag && (a/b == 0)) System.out.println("AND");

        //4. String Connection Operator
        String school = "디미고";
        int grade = 2;
        int ban = 3;
        String name = "나자바";
        System.out.println(school + grade + ban + name);
        System.out.println(grade + (ban + school) + name);
    }
}
