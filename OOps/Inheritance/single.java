class A{
    void Display(){
        System.out.println("This is Parent class");
    }
}
class B extends A{
    void Print(){
        System.out.println("This is child class");
    }
}
public class single{
    public static void main(String args[]){
        B b = new B();
        b.Display();
        b.Print();
    }
}