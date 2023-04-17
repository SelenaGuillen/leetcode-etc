package com.selenaguillen.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

// Want a list to mimic names of dropdown searches, current searches current name to add
public class IncrementRenames {

    //global variables
    public static List<String> list = new ArrayList<>();
    public static Map<String, Integer> map = new HashMap<>();

    public static void main (String[] args) {
        addNewSearch("Cinna", list);
        addNewSearch("Cinna", list);
        addNewSearch("Cinna", list);
        addNewSearch("test", list);
        addNewSearch("Ignored   ", list);
        addNewSearch("test", list);
        addNewSearch("Cinna (4)", list);
        addNewSearch("Cinna (4)", list);

        list.remove(4);
        addNewSearch("Cinna", list);


        System.out.println("Here are the current names in map");
        printMap(map);
        System.out.println("Here are the current searches: ");
        printList(list);
    }


    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printMap(Map<String, Integer> map) {
        System.out.print(map);
    }

    public static void addNewSearch(String name, List<String> list) {

        if (!list.contains(name)) {
            map.put(name, 1);
            list.add(name);
        } else {
            String newName = name + "(" + map.get(name) + ")";
            // String newName = "niko";
            map.replace(name, map.get(name) + 1);
            list.add(newName);
        }
    }
}
    

