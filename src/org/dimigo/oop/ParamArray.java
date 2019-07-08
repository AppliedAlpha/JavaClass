package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(strArr, "김");
        printArray(strArr);
    }

    private static void changeName(String[] strArr, String replacement) {
        for (int i=0; i<strArr.length; i++) {
            //strArr[i] = replacement + strArr[i].substring(1);
            strArr[i] = strArr[i].replace("홍", replacement);
        }
    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.printf("%s | ", value);
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.printf("%d | ", value);
        }
        System.out.println();
    }

    private static void add(int[] intArr, int num) {
        for (int i=0; i<intArr.length; i++) {
            intArr[i] += num;
        }
    }
}
