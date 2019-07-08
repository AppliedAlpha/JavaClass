package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //Map (Key(Unique), Value)
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 90);
        map.put("mat", 82);
        map.put("eng", 90);
        map.put("eng", 81);

        printMap(map);
        System.out.println(map.get("kor"));
        System.out.println(map.get("cot"));

        map.remove("eng");
        printMap(map);

        map.clear();
        printMap(map);

        //HashMap (Key: String, Value: List<String>)
        Map<String, List<String>> map2 = new HashMap<>();

        //ArrayList (Map<String, String>)
        List<Map<String, String>> list = new ArrayList<>();
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.print(key + " : " + map.get(key) + " | ");
        }
        System.out.println();
    }
}
