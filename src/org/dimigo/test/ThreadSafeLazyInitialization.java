package org.dimigo.test;

public class ThreadSafeLazyInitialization{

    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization(){}

    public static synchronized ThreadSafeLazyInitialization getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazyInitialization();
        }
        return instance;
    }

}