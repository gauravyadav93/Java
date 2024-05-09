class Cons{
    int a=10,b=20,c=50,d=35,e;
    Cons(){
        e = (a+b+c+d)/4;
    }
    void Display(){
        System.out.println("Percentage is" + e + "%");
    }
}
public class consmethod{
    public static void main(String args[]){
        Cons c = new Cons();
        c.Display();
    }
}