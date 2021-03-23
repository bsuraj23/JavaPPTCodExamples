package ObjectOrienExample;// Java Program to illustrate calling a
// no-argument constructor
import java.io.*;

class ConstructorsExmaple
{
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.
    ConstructorsExmaple()
    {
        System.out.println("Constructor called");
    }
}

class GFG
{
    public static void main (String[] args)
    {
        // this would invoke default constructor.
        ConstructorsExmaple geek1 = new ConstructorsExmaple();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}
