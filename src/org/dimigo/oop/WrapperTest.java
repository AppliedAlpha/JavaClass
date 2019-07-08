package org.dimigo.oop;

import java.util.Arrays;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper Class: Objectify Primitive Data Types
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(22));
        System.out.println(Integer.toHexString(22));

        //Boxing: Primitive Data Type -> Wrapper Class Object
        //Using Generator
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        //valueOf?
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf("3.1415926535897932384626433832795028");

        //Unboxing
        int ii = i3.intValue();
        double dd = d1.doubleValue();

        //String -> Primitive Type : parse
        String str1 = "12345679";
        int i5 = Integer.parseInt(str1);
        System.out.println(i5 * 9);

        double d2 = Double.parseDouble("3.1415926535897932384626433832795028");
        System.out.println(d2);
        // System.out.println(Integer.parseInt(3.14)); -> Error

        //Configuration?!
        System.out.println(Arrays.toString(args));

        int[] argsParse = new int[args.length];
        int argsTotal = 0;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<args.length; i++) {
            argsParse[i] = Integer.parseInt(args[i]);
            argsTotal += argsParse[i];
            sb.append(argsParse[i]);
            if (i != args.length-1) sb.append(" + ");
            else {
                sb.append(" = ").append(argsTotal);
            }
        }
        System.out.println(sb.toString());

        //Auto-Boxing
        Integer n1 = 1000;
        //Integer n1 = new Integer(1000);
        Integer n2 = new Integer(2000);
        System.out.println(n1 + n2); //3000

        //Auto-Unboxing
        int i6 = n1 + 100;
        //int i6 = n1.intValue() + 100;
    }
}
