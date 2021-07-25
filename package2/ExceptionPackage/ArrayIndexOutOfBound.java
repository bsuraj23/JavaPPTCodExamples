package package2.ExceptionPackage;

// java program to demonstrate
// need of try-catch clause

class GFG {
    public static void main (String[] args) {
  try {
      // array of size 4.
      int[] arr = new int[4];





      // this statement causes an exception
      int i = arr[2];
      System.out.println("I valus is  " + i);
      // the following statement will never execute
      System.out.println("Hi, I want to execute");
  }
  finally
  {

      System.out.println("  I am finnally block and i will be executed fpor sure");
  }
    }
}

