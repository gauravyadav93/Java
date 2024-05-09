class Base{
    Base(){
        System.out.println("This is base class.");
    }
}
class Child extends Base{
    Child(){
        System.out.println("This is child class.");
    }
}
public class inheritanceconstruct{
    public static void main(String args[]){
        Child c = new Child();
    }
}