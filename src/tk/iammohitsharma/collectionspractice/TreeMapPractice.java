package tk.iammohitsharma.collectionspractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** TreeMap Demo ************************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in TreeMap : \n{1=First Entry, 1=First Entry Duplicate, 2=Second Entry, " +
                "3=Third Entry, 4=Fourth Entry), 4=Fourth Entry Duplicate}");
        Map<Object, String> map = new TreeMap<>();
        map.put(1, "First Entry");
        map.put(1, "First Entry Duplicate");
        map.put(2, "Second Entry");
        map.put(3, "Third Entry");
        map.put(4, "Fourth Entry");
        map.put(3, "Third Entry Duplicate");
        map.put(1, "First Entry");
        map.put(1, "First Entry Duplicate");
        System.out.println("\nItreating from TreeMap : ");
        System.out.println(map);
        System.out.println("\n\nRemoving key=3 from TreeMap..\n");
        map.remove(3);
        System.out.println("Itreating again : ");
        System.out.println(map);
    }
}
