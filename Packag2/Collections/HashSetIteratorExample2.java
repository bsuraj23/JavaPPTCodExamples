package Packag2.Collections;

import java.util.*;

public class HashSetIteratorExample2 {
    public static void main(String args[]) {

        // Declaring a HashSet
        HashSet<String> hashset = new HashSet<String>();
        // Add elements to HashSet
        hashset.add("Pear");
        hashset.add("Apple");
        hashset.add("Orange");
        hashset.add("Papaya");
        hashset.add("Banana");

        System.out.println("HashSet contains :");
        // Using for each loop
        for(String str : hashset){
            System.out.println(str);
        }
    }
}
