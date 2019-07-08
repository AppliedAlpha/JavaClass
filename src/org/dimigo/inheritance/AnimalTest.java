package org.dimigo.inheritance;

public class AnimalTest {

    /*
    Over-riding: Method => Inheritance, Re-Declaration
    Over-loading: Constructor => Different Type of variables.
     */

    public static void main(String[] args) {
        Animal a = new Animal("동물");
        Dog dog = new Dog("댕댕이");
        Cat cat = new Cat("야옹이");
        Tiger tiger = new Tiger("호돌이");

        a.bark();
        a.sleep();
        dog.bark();
        cat.bark();
        cat.eat();
        tiger.bark();

        dog.catchBall();
        cat.scratch();
        tiger.hunt();

        tiger.bark();
        tiger.hunt();

        Animal a2 = new Dog("멍뭄미");
        Animal a3 = new Cat("냥냥이");
        Animal a4 = new Tiger("랑이");
        a2.bark();
        a3.bark();
        a4.bark();

//        Animal[] animals = {
//                new Dog("멍"),
//                new Cat("냥"),
//                new Tiger("흥")
//        };

//        for (Animal animal : animals) {
//            doBark(animal);
//        }

        Animal b = new Dog("또멍이");

        b.sleep();
        ((Dog) b).catchBall();

        Dog doggy = (Dog) b;
        doggy.catchBall();

        //((Cat) b2).scratch();

        // instanceof
        Animal c1 = new Dog("멍댕");
        Animal c2 = new Cat("냥캣");
        System.out.println(c1 instanceof Dog);
        System.out.println(c2 instanceof Cat);
        System.out.println(c1 instanceof Cat);
        System.out.println(c2 instanceof Dog);
        System.out.println(c1 instanceof Animal);
        System.out.println(c2 instanceof Object);

        doBark(c1);
        doBark(c2);

    }

    private static void doBark(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.catchBall();
        }
        else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }
}
