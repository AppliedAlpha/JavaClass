package org.dimigo.oop;

public class Calculator2 {
    /******* Static Field *******/
    public static double PI = 3.1415926535897932384626433832795028;
    private boolean powerFlag = false;

    /******* Instance Method *******/
    public void powerOn() {
        if (!powerFlag) {
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
    }

    public void powerOff() {
        if (powerFlag) {
            System.out.println("전원을 끕니다.");
            powerFlag = false;
        }
    }

    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        //Calculator c = new Calculator(a, b);

        Calculator2 c = new Calculator2();

        //c.powerOn();
        System.out.printf("%d + %d = %d\n", a, b, add(a, b, c));
        System.out.printf("%d + %d = %d\n", a, b, sub(a, b, c));
        System.out.printf("%d * %d = %d\n", a, b, mul(a, b, c));
        System.out.printf("%d / %d = %.3f\n", a, b, div(a, b, c));
        c.powerOff();

        System.out.println(Calculator2.PI);
    }
}
