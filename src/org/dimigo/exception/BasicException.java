package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
            //System.out.println(Integer.parseInt("123a"));
            //new NullPointerException();
//        } catch (NullPointerException npe) {
//            //NullPointerException npe = new NullPointerException();
//            System.out.println("쓰세요");
//            //npe.printStackTrace();
//        } catch (NumberFormatException nfe) {
//            System.out.println("숫자로 쓰세요");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void validate(String id) throws Exception {
        try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("Input ID");
                throw e;
            }
            if (id.length() < 8) {
                throw new Exception("8자리 이상 입력하세요.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = br.readLine()) != null) System.out.println(str);
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 없어요");
        } catch (IOException ie) {
            System.out.println("없졍");
        }
    }

    // Compiler don't ask for exception try-catch with force.
    private static void uncheckedException(String s) {
        System.out.println(s.length());
    }
}
