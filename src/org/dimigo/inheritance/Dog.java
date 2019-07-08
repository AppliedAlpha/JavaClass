package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("멍멍");
    }

    public void catchBall() {
        System.out.println(name + "이/가 공을 물어와요.");
    }
}
