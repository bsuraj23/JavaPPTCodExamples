package package2;

public class TryExample {

    public static void main (String[] args)
    {


        try
        {

            System.out.println("Inside try block");
            System.out.println("Inside try block");
            System.out.println("Inside try block");
            //exception

        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in Catch block");
        }


        System.out.println("Outside try-catch clause");
    }
}