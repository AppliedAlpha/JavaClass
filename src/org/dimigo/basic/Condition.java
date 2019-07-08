package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        //1. If
        int age = 17;
//        System.out.println(age >= 19 ? "투표하러 갑시다" : "선거권이 없네요");
        if (age >= 19) System.out.println("투표하러 갑시다");
        else System.out.println("선거권이 없네요");

        //2. Switch
        int num = new Random().nextInt(6) + 1;

        switch (num % 2) {
            case 0:
                System.out.printf("짝수입니다.");
                break;
            case 1:
                System.out.printf("홀수입니다.");
                break;
        }

        String menu = "짜장면";

        switch (menu) {
            case "짜장면":
                System.out.printf("짜장면이다.");
                break;
            case "짬뽕" :
                System.out.printf("짬뽕이다.");
                break;
        }

//        while (true) {
//            Scanner s = new Scanner(System.in);
//            int a = s.nextInt();
//            System.out.printf("%d\n", a);
    }
}
