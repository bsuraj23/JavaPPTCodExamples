package Packag2.Collections;
import java.util.LinkedHashSet;
import java.util.ArrayList;


import java.util.LinkedHashSet;
import java.util.Iterator;

class LinkedHashSet1 {
    public static void main(String[] args) {
        // Creating an arrayList of even numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("ArrayList: " + evenNumbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet: " + numbers);
        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();
        //adding in same
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("LinkedHashSet: " + evenNumber);

        LinkedHashSet<Integer> numbers2= new LinkedHashSet<>();

        // Using addAll() method
        numbers2.addAll(evenNumber);
        numbers2.add(5);
        System.out.println("New LinkedHashSet: " + numbers);
        // Calling the iterator() method
        Iterator<Integer> iterate = numbers.iterator();

        System.out.print("LinkedHashSet using Iterator: ");

        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
        LinkedHashSet<Integer> numbers3 = new LinkedHashSet<>();
        numbers3.add(1);
        numbers3.add(3);
        System.out.println("LinkedHashSet2: " + numbers);

        // Union of two set
        numbers3.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

        LinkedHashSet<Integer> numbers23 = new LinkedHashSet<>();
        numbers23.add(1);
        numbers23.add(2);
        numbers23.add(3);
        numbers23.add(4);
        System.out.println("LinkedHashSet1: " + numbers2);

        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet2: " + primeNumbers);

        // Check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is LinkedHashSet2 is subset of LinkedHashSet1? " + result);


    }
    }


