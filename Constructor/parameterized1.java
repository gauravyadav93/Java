class Cons{
    String name;
    float marks;
    Cons(String name,float marks){
        this.name = name;
        this.marks = marks;
    }
    void Display(){
        System.out.println("Hii " + name + " " + "your marks are: " + marks);
    }
}
public class parameterized1{
    public static void main(String args[]){
        Cons c = new Cons("Gaurav",70);
        c.Display();
        Cons c1 = new Cons("Divyanshu",70);
        c1.Display();
     }
}