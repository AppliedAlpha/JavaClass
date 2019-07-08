package org.dimigo.oop;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() { //Make Before Start
        return instance;
    }

    //LazyInitialization
    public static synchronized Singleton getInstance2() { //Make When Called
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
