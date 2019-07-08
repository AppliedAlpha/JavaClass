package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        Book book2 = new Book("마닳");

        System.out.printf("%s\n%s\n%d\n", book.getTitle(), book.getAuthor(), book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuthor("김재영");
        book.setPage(-1);

        System.out.printf("%s\n%s\n%d\n", book2.getTitle(), book2.getAuthor(), book2.getPage());

    }
}
