package Packag2.Collections;
import java.util.Stack;

import java.util.HashSet;
import java.util.Iterator;

class Stack1 {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);


        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        //search
        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);

        // Calling iterator() method
        Iterator<String> iterate = animals.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
        HashSet<Integer> evenNumbers  = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);


    }
}