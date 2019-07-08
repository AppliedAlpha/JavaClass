package org.dimigo.oop;

public class BookTest2 {
    private static void compare() {
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "true" : "false");

        book2.setTitle("수학의 바이블");
        System.out.println(book.getTitle());
    }

    public static void main(String[] args) {
        compare();
        System.out.printf("--------------------\n");

        int num = 5;
        methodA(num);
        System.out.println(num); //5

        Book book = new Book("자바를 잡았다");
        methodB(book);
        System.out.println(book.getTitle());

        methodC(book);
        System.out.println(book.getTitle());

        Book book2 = new Book();
        System.out.println(book2.getTitle());
    }

    private static void methodC(Book book) {
        book.setTitle("공업수학");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("중궈");
        System.out.println(book.getTitle());
    }

    private static void methodA(int num) {
        num--;
        System.out.println(num); //4
    }
}
