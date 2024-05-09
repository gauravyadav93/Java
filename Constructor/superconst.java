class Base{
    String name;
    Base(){
        System.out.println("This is base class constructor.");
    }
    Base(String name){
        this.name = name;
    }
}
class Child extends Base{
    Child(){
        System.out.println("This is child class constructor.");
    }
    Child(String name){
        super(name);
        System.out.println(name);
    }
} 
public class superconst{
    public static void main(String args[]){
        Child c = new Child();
        Child c1 = new Child("Java");
    }
}