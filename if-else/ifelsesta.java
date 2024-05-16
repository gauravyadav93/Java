class If{
    void Display(){
        int age = 19;
        if(age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
    }
}
public class ifelsesta{
    public static void main(String args[]){
        If i = new If();
        i.Display();
    }
}