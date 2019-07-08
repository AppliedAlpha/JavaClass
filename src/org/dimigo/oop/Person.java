package org.dimigo.oop;

public class Person {
    public static final String TYPE = "포유류";
    private final String birthday;
    private String name;

    public Person(String birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthday='" + birthday + '\'' +
                ", name=" + name +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020101", "A");
        Person p2 = new Person("20020202", "B");
        System.out.println(p1);
        System.out.println(p2);
        //p1.TYPE = "파충류";
        p1.toString();
        System.out.println(Person.TYPE);
    }
}
