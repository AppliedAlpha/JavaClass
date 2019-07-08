package org.dimigo.inheritance;

public class Person {
    public String name; //+
    protected int age; //#
    int height; //~
    private int weight; //-

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {

    }

    public void eat() {
        System.out.printf("%s이(가) 밥을 먹는다.\n", name);
    }

    public void sleep() {
        System.out.printf("%s이(가) 잠을 잔다.\n", name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
