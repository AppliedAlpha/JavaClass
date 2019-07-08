package org.dimigo.exampractice;

public class Examinationtest {
    public static void main(String[] args) {
        Examination gun = new Examination("관악", "똥명고", 2);
        Examination won = new Examination("철산", "명북고");

        System.out.printf("%s | %s | %d\n", gun.getCity(), gun.getSchool(), gun.getGrade());
        System.out.printf("%s | %s | %d\n", won.getCity(), won.getSchool(), won.getGrade());
    }
}
