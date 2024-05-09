class Cons{
    String name;
    Cons(String name){
        this.name = name;
        System.out.println("Your name is"+name);
    }
}
public class parameterized{
    public static void main(String args[]){
        Cons c = new Cons("Java");
        Cons c1 = new Cons("Programming");
    }
}