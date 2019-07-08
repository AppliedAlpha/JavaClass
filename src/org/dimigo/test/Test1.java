package org.dimigo.test;

public class Test1 {
    private Test1() {
    }

    private static class One {
        public static final Test1 INSTANCE = new Test1();
    }

    public static Test1 getInstance() {
        return One.INSTANCE;
    }
}
