package package2;

import java.io.*;
import java.util.*;

class ArrayEx1 {
    public static void main(String[] args)
    {

        // Declaring the ArrayList with 
        // initial size n 
        ArrayList al
                = new ArrayList();

        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= 5; i++)   //i= 1
            al.add(i);

        // Printing elements 
        System.out.println(al);

        // Remove element at index 3 
        al.remove(3);

        // Displaying the ArrayList 
        // after deletion 
        System.out.println(al);

        // Printing elements one by one 
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
} 