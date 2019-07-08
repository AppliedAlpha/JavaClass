package org.dimigo.inheritance;

public class Student extends Person {
    private String studentId;

    public void study() {
        System.out.printf("%s이(가) 공부합니다.\n", getName());
    }

    public void eatSnack() {
        System.out.printf("%s이(가) 과자를 먹습니다.\n", getName());
    }

    public Student(String name, int age, int height, int weight, String studentId) {
        super(name, age, height, weight);
        this.studentId = studentId;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}
