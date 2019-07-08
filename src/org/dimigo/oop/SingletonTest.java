package org.dimigo.oop;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance2();
        Singleton s2 = Singleton.getInstance2();
        Singleton s3 = Singleton.getInstance2();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}
