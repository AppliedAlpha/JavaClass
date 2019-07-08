package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유", 25, 160, 45);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("박성은", 18, 180, 70, "172311");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.study();
        s.eatSnack();

        Teacher t = new Teacher("전유원", 30, 180, 65, "영어");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.overSee();
    }
}
