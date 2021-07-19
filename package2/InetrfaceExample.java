package package2;


interface printable{
    void print();
}
class InetrfaceExample implements printable{
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        InetrfaceExample obj = new InetrfaceExample ();
        obj.print();
    }
}