package package2;

import java.io.File;

class Try3

{
    public static void main (String[] args)
    {

        // array of size 4. 
        int[] arr = new int[2];
        try
        {
          //  int i = arr[4];
            int a=90;
  int c= a/45;

            // this statement will never execute 
            // as exception is raised by above statement 
            System.out.println("Inside try block");
        }

        // not a appropriate handler 
        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught  NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block  ArrayIndexOutOfBoundsException");
        }

        finally
        {
            System.out.println("finally block executed");
        }
        // rest program will not execute 
        System.out.println("Outside try-catch clause");
    }
} 