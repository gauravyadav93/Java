abstract class demo{
    abstract void display();
    void display2(){
        System.out.println("This is non_abstract class");
    }
}
class child extends demo{
    public void display(){
        System.out.println("This is mathod of abstract class");
    }
}
public class abstract1{
    public static void main(String args[]){
        child c = new child();
        c.display();
        c.display2();
    }

}
