package package2;



class ArrayEx1 {
    public static void main(String[] args)
    {
System.out.println("I am a main class  function");

        Sample2 obj = new Sample2();
      System.out.println(obj.a   );
     //   System.out.println(obj.b);
        System.out.println(obj.add(23));
        System.out.println();


            }
}
class Sample{
    //variables
     byte pin= 90;
    int  add(int  s){
        System.out.println("I am add function from  Sample with int  as para ");
        return s;
    };


}
class Sample2 extends Sample{

    //variables
    int a=87;

    //function


}