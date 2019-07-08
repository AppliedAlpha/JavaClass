package org.dimigo.inheritance;

public class Teacher extends Person {
    private String subject;

    public void teach() {
        System.out.printf("%s 선생님이 공부를 가르칩니다.\n", getName());
    }

    public void overSee() {
        System.out.printf("%s 선생님이 감독을 합니다.\n", getName());
    }

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString();
    }


}
