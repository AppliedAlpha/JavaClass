package org.dimigo.inheritance;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    //Method Over-riding
    public void bark() {
        System.out.println("어흥");
    }

    public void hunt() {
        System.out.println(name + "이/가 사냥합니다.");
    }
}
