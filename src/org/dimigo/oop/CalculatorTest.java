package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int x = 10, y = 20;
        Calculator a = new Calculator(x, y);
        System.out.printf("%d + %d = %d\n", x, y, a.add());
        System.out.printf("%d + %d = %d\n", x, y, a.sub());
        System.out.printf("%d * %d = %d\n", x, y, a.mul());
        System.out.printf("%d / %d = %.3f\n", x, y, a.div());
        a.powerOff();
    }
}
