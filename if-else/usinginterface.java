interface A{
    abstract void Display(int age);
}
class B implements A{
    int age;
    public void Display(int age){
        this.age = age;
        if(age>=18){
            System.out.println("Your age is greater than 18");
        }
        else{
            System.out.println("Your age is less than 18");
        }
    }
    
}
public class usinginterface{
    public static void main(String args[]){
        B b = new B();
        b.Display(18);
    }
}