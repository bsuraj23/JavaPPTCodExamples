package AccessSpecifierExample;

public class PrivateExample {
}
class A{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}

class Simple2{
    public static void main(String args[]){
        A obj=new A();
      //  System.out.println(obj.data);//Compile Time Error
       // obj.msg();//Compile Time Error
    }
}


//other package
class B3{
    public static void main(String args[]){
        A obj = new A();//Compile Time Error
     //   obj.msg();//Compile Time Error
    }
}
//default Example
class B extends A{
    public static void main(String args[]){
        B obj = new B();
      //  obj.msg();
    }
}


//Public example
class B2{
    public static void main(String args[]){
        A obj = new A();
        //obj.msg();
    }
}
