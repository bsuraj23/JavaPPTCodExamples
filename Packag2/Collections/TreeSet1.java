package Packag2.Collections;
import java.util.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

class TreeSet1 {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);

        System.out.println("TreeSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

            // Using the remove() method
            boolean value1 = numbers.remove(5);
            System.out.println("Is 5 removed? " + value1);

            // Using the removeAll() method
            boolean value2 = numbers.removeAll(numbers);
            System.out.println("Are all elements removed? " + value2);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(2);
        numbers2.add(5);
        numbers2.add(4);
        numbers2.add(6);
        System.out.println("TreeSet: " + numbers2);

        // Using higher()
        System.out.println("Using higher: " + numbers2.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers2.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers2.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers2.floor(3));

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers2.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers2.pollLast());

        System.out.println("New TreeSet: " + numbers2);

        TreeSet<Integer> numbers3 = new TreeSet<>();
        numbers3.add(2);
        numbers3.add(5);
        numbers3.add(4);
        numbers3.add(6);
        System.out.println("TreeSet: " + numbers3);

        // Using headSet() with default boolean value
        System.out.println("Using headSet without boolean value: " + numbers3.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value: " + numbers3.headSet(5, true));


        // Using tailSet() with default boolean value
        System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));
    }
}
