abstract class Addition{
    private int a;
    private int b;
    public void setAdd(int c, int d){
        a = c;
        b = d;
    }
    public void getAdd(){
        System.out.println(a+b);
    }
}
class Child extends Addition{
    public void Display(){
        System.out.println("THis is encapsulation example using abstract class");
    }
}
public class TwoAdd{
    public static void main(String args[]){
        Child a1 = new Child();
        a1.setAdd(5,6);
        a1.getAdd();
        a1.Display();
    }
}