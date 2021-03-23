package package2;

import java.util.*;
public class StackExample {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack 
        Iterator<String> itr
                = stack.iterator();

        // Printing the stack 
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack 
        itr
                = stack.iterator();

        // Printing the stack 
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
} 