package package2;

class Try
{
    public static void main (String[] args)
    {

        // array of size 4. 
        int[] arr = new int[4];
        byte total;
        try
        {
            int c= 6/3;
            System.out.println("result c is "+c);
//            System.out.println("Stratd with  try block");
//            int i = arr[4];
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
        }
        catch(Exception ex)
        {
            System.out.println("Exception caught in Catch block");
        }

        // rest program will be excuted 
        System.out.println("Outside try-catch clause");
    }
} 