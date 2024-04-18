class A{
    public void display(){
        System.out.println("This is base class");
    }
}
class B extends A{
    public void print(){
        System.out.println("This is first child class");
    }
}
class C extends A{
    public void show(){
        System.out.println("This is second child class");
    }
}
public class hierarchical{
    public static void main(String args[]){
        C d = new C();
        d.display(); 
        d.show(); 
        B m = new B();
        m.display();
        m.print();
    }
}