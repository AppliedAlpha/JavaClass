package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        //int type 2-dimension array
        int[][] intArr = new int[2][3];

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);

        //String type 2-dimension array
        String[][] strArr = new String[2][]; //[null] [null]
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "C#";
        strArr[1][1] = "Python";

        String[][] strArr2 = {
                {"C", "C++", "JAVA"},
                {"C#", "Python"}
        };

        String[][] strArr3 = new String[][] {
                {"C", "C++", "JAVA"},
                {"C#", "Python"}
        };

        String[][] strArr4 = new String[][] {
                new String[]{"C", "C++", "JAVA"},
                new String[]{"C#", "Python"}
        };

        String[][] strArr5 = {
                new String[]{"C", "C++", "JAVA"},
                new String[]{"C#", "Python"}
        };

        printArray(strArr);
        printArray(strArr2);
        printArray(strArr3);
        printArray(strArr4);
        printArray(strArr5);
    }

    private static void printArray(String[][] strArr) {
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.printf("%s | ", value);
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = 0; j < intArr[i].length; j++) {
//                System.out.printf("%d | ", intArr[i][j]);
//            }
//            System.out.println();
//        }

        for (int[] arr : intArr) {
            for (int value : arr) {
                System.out.printf("%d | ", value);
            }
            System.out.println();
        }
    }
}
