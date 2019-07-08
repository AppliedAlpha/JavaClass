package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //1. String Literal
        String dog1 = "설기";
        String dog2 = "설기"; //already exist -> same address with dog1
        System.out.println(dog1 == dog2); //true

        //2. New Object
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이"); //new makes another address
        System.out.println(cat1 == cat2); //false

        //Question
        System.out.println(dog1 == "설기"); //true -> same address
        System.out.println(cat1 == "야옹이"); //false -> not same

        //String Comparison: equals() -> compare the contents
        System.out.println(dog1.equals(dog2)); //true
        System.out.println(cat1.equals(cat2)); //true

        //String id = "admin";
        //Scanner s = new Scanner(System.in);
        //String id_in = s.nextLine();
        //System.out.println(id.equalsIgnoreCase(id_in) ? "어드민" : "일반 사용자");
        // "admin".equalsIgnoreCase(String) -> For Checking 'Null'


        System.out.println();
        testString();
    }

    private static void testString() {
        //Index     01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3)); //Cutting From Index No. 3 -> defg~~
        System.out.println(s.substring(3, 6)); //From 3, Count 6-3 -> def
        System.out.println(s.indexOf("C")); //Where Is "C" -> Index 9
        System.out.println(s.charAt(7)); //What is in Index 7 -> "A"
        System.out.println(s.concat("ABC")); //Adds "ABC" behind s
        System.out.println("   A B C   ".trim()); //Removes Front-End SpaceBar
        System.out.println(s.toUpperCase()); //Upper Case
        System.out.println(s.toLowerCase()); //Lower Case
        System.out.println(s.replace("a", "a".toUpperCase())); //replacement
        System.out.println((s.startsWith("abc"))); //true
        System.out.println(s.endsWith("EFG")); //true


    }
}
