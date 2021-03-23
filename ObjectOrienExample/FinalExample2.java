package ObjectOrienExample;

// Java program to demonstrate
// reference final variable

class FinalExample2
{
    public static void main(String[] args)
    {
        // a final reference variable sb
        final StringBuilder sb = new StringBuilder("Geeks");

        System.out.println(sb);

        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForGeeks");

        System.out.println(sb);
    }
}

