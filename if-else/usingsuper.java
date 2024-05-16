class If{
    int age;
    If(int age){
        this.age = age;
    }
}
class Else extends If{
    Else(int age){
        super(age);
    }
    void Display(){
        if(age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
    }
}
public class usingsuper{
    public static void main(String args[]){
        Else i = new Else(19);
        i.Display();
    }
}