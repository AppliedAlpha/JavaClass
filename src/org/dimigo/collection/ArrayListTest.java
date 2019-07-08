package org.dimigo.collection;

import org.dimigo.abstractclass.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //Generate ArrayList
        List list = new ArrayList();
        list.add("나자바");
        list.add(100);
        list.add(new Dog());

        //Generic
        List<String> list2 = new ArrayList<>();
        list2.add("사과"); //0
        list2.add("배"); //1
        list2.add("딸기"); //2
        list2.add("딸기"); //3

        list2.add(1, "포도"); //나머지 하나씩 밀려남
        list2.set(1, "바나나"); //아예 교체
        printList(list2);

        System.out.println(list2.get(2));
        System.out.println(list2.lastIndexOf("딸기"));
        System.out.println(list2.get(list2.size()-1));

        list2.remove(0);
        list2.remove("딸기");
        printList(list2);

        list2.remove("키위");
        list2.clear();
        printList(list2);
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }
}
