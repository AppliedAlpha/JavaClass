package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울", "대전", "대구", "부산"};

        //printing Array
        System.out.println(Arrays.toString(src));

        //copying Array
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        //comparing Array
        System.out.println(Arrays.equals(src, dest));

        //sorting Array
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //searching Array (caution: sorting before searching)
        System.out.println(Arrays.binarySearch(dest, "부산"));
    }
}
