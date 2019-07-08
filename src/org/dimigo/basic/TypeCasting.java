package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        //1. Promotion: Small Type -> Bigger Type
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        System.out.printf("%d %d %d %d\n", b, s, i, l);

        //2. Casting: Big Type -> Smaller Type
        i = (int)l;
        s = (short)i;
        b = (byte)s;
        System.out.printf("%d %d %d\n", b, s, i);

        //Warning While Casting -> Checking Range
        int i2 = 128;
        byte b2 = (byte)i2;
        System.out.println(b2);

        long l2 = 10000000000L;
        int i3 = (int)l2;
        System.out.println(i3);
    }
}
