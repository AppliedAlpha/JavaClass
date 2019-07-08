package org.dimigo.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    //Method Re-declaration => Method Over-riding
    public void bark() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println(name + "이/가 할퀴어요.");
    }
}
