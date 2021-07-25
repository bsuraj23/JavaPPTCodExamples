package Packag2.Collections;

import java.util.*;
public class ArrayListLoopExample {
    public static void main(String args[]) {
  // byte short int long float double char boolaen  //primoitive

        //object

//        Sample obj1 = new Sample();
//        Sample obj2 = new Sample();
//        Sample obj3 = new Sample();
//        Sample obj4 = new Sample();
//        Sample obj5 = new Sample();

//        obj1.function_name();

        // [] [] [] []


//

        boolean   b[]= new boolean[9];
        b[0]= true;
        b[1]= true;
        b[2]= true;
        b[3]= true;
        System.out.println("The valUE is "+b[0]);
        System.out.println("The valUE is "+b[1]);
        System.out.println("The valUE is "+b[2]);
        System.out.println("The valUE is "+b[3]);

        //array example
        int  a[]= new int[4];
        //init
        a[0]= 23;
    //    a[1] = 90.67;
       // a[1]= "shivani";  //Ascii

        System.out.println("The valUE is "+a[1]);
        System.out.println("The length is array a is  is"+a.length);

        // initialize ArrayList


//        ArrayList<Integer> al = new ArrayList<Integer>();
//        // add elements to ArrayList object
//        al.add(3);
//        al.add(17);
//        al.add(6);
//        al.add(9);
//        al.add(7);
//        System.out.println("Using Advanced For Loop");
//        // printing ArrayList
//        for (Integer num : al) {
//            System.out.println(num);
//        }
    }


}
interface  Jumping
{
    void function_name2();
    String  function_name3();
    int  function_name4();


}

class NewClass implements  Jumping
{


    @Override
    public void function_name2() {

    }

    @Override
    public String function_name3() {
        return null;
    }

    @Override
    public int function_name4() {
        return 0;
    }
}


    abstract class Sample {
int a=90;

    abstract void function_name();

}

class Other extends  Sample{


    @Override
    void function_name() {


    }
}


