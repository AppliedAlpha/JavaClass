package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1. For
        for (int i=2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }

        //2. For-Each
        int[] arr = {1, 2, 3, 4, 5};
        for (int value : arr) System.out.printf("%d, ", value);
        for (int i=0; i<arr.length; i++) System.out.printf("%d, ", arr[i]);

        //3. While, Do ~ While
        //Menu
        Scanner s = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.printf("<<선택>>\n1. ㅎㅇ\n2. ㅂㅇ\n9. ?\n메뉴 입력 => ");
            menu = s.nextInt();
            switch (menu) {
                case 1:
                    System.out.printf("왔냐\n");
                    break;
                case 2:
                    System.out.printf("잘가\n");
                    break;
                case 9:
                    System.out.printf("가라\n");
                    s.close();
                    break;
                default:
                    System.out.printf("그없\n");
            }
        }
        while (menu != 9);
    }
}
