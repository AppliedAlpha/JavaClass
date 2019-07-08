package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //Basic-Type Array
        //int, float, double, byte, boolean, short, char, long
        int[] intArr = null;
        intArr = new int[5];
        double[] doubleArr = new double[5];

        printArray(intArr);
        printArray(doubleArr);

        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[] {1, 2, 3, 4, 5};

        printArray(intArr2);
        printArray(intArr3);

        //Reference Type Array
        //String, StringBuilder, Scanner, Classes (Car, Book ...)
        //made with 'new'
        String[] strArr = new String[3];
        Book book = null;
        Car car = null;

        strArr[0] = "중궈";
        strArr[1] = "기제";
        strArr[2] = "문학";
        printArray(strArr);

        String[] strArr2 = new String[] {"정진영", "기안84", "정민욱"};
        printArray(strArr2);

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재용");
        bookArr[1] = new Book("비마니", "코나미", 573);

        Book[] bookArr2 = new Book[] {
                new Book("수학의 바이블", "김재용"),
                new Book("비마니", "코나미", 573)
        };

        printArray(bookArr);
        printArray(bookArr2);

        //Caution With Array
        int[] intArr4 = null;
        String[] strArr3 = new String[3];
        Book[] bookArr3 = new Book[3];

        //System.out.println(intArr4.length); //NullPointerException
        intArr4 = new int[3];
        System.out.println(intArr4.length);

        //System.out.println(intArr4[3]); //ArrayIndexOutOfBounds
        System.out.println(intArr4[intArr4.length-1]);

        //System.out.println(strArr3[0].length()); //NullPointerException
        //System.out.println(bookArr3[0].getTitle()); //NullPointerException

        String[] strArr4 = null;
        strArr4 = new String[] {"이유진", "윤효연", "정민욱"};
    }

    private static void printArray(Book[] bookArr) {
        for (Book book : bookArr) {
            //System.out.printf("%s | ", value.toString());
            System.out.println(book); //Automatic toString
        }
    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.printf("%s | ", value);
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) { //for-which repeat
            System.out.printf("%d | ", value);
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr) {
            System.out.printf("%f | ", value);
        }
        System.out.println();
    }
}
