class If{
    int age;
    If(int age){
        this.age = age;
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
public class ifparameterized{
    public static void main(String args[]){
        If i = new If(17);
        i.Display();
    }
}