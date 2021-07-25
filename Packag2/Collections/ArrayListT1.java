package Packag2.Collections;

import java.util.ArrayList;

class ArrayLisT1 {
    public static void main(String[] args){

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);
        //accessing the ArraylIst objects
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // aemove element from index 2
        String str2 = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str2);
        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String language : languages) {
            System.out.print(language);
            System.out.print(", ");
        }



    }
}
