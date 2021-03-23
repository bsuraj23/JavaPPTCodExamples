package ObjectOrienExample;

// Java Program to illustrate constructor overloading
// using same task (addition operation ) for different
// types of arguments.
import java.io.*;

class Geek2
{
    // constructor with one argument
    Geek2(String name)
    {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }

    // constructor with two arguments
    Geek2(String name, int age)
    {

        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);

    }

    // Constructor with one argument but with different
    // type than previous..
    Geek2(long id)
    {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}

class GFG22
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Geek2 geek2 = new Geek2("Shikhar");

        // Invoke the constructor with two arguments
        Geek2 geek3 = new Geek2("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geek2 geek4 = new Geek2(325614567);
    }
}
