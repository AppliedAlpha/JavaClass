package org.dimigo.exampractice;

public class Examination {
    private String city;
    private String school;
    private int grade;

    public Examination() {}
    public Examination(String city, String school, int grade) {
        this.city = city;
        this.school = school;
        this.grade = grade;
    }

    public Examination(String city, String school) {
        this.city = city;
        this.school = school;
        this.grade = 0;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
