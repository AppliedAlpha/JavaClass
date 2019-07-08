package org.dimigo.interfaces;

public interface IAnimal {
    //Interface -> public static final
    String FARM_NAME = "디미 동물농장";

    //JDK 8~: static & default method
    static void welcome() {
        System.out.println(FARM_NAME + "에 어서오세요");
    }

    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }

    default void bark() {
        System.out.println("야옹");
    }
}
