package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //1. String Character Array
        String s = "디미고 ";
        s += "2학년 ";
        s += "3반 ";
        s += "윤효연";
        System.out.println(s);

        //2. StringBulider
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("3반 ").append("윤효연");
        System.out.println(sb.toString());

        compareSpeed();
    }

    private static void compareSpeed() {
        //String, StringBuffer, StringBulider
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for (int i=0; i<10000000; i++) {
            //str += "def";
            //sb.append("def");
            sb2.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
