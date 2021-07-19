package package2;

interface Bank{
    float rateOfInterest();
}
class HDFC implements Bank{
    public float rateOfInterest(){return 9.15f;}
}
class PNB implements Bank{
    public float rateOfInterest(){return 9.7f;}
}
class TestInterface2{
    public static void main(String[] args){
        Bank b=new HDFC();
        System.out.println("ROI: "+b.rateOfInterest());
    }}