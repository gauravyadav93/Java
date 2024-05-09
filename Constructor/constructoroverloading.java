class Cons{
    String name;
    Cons(){
        System.out.println("This is default constructor.");
    }
    Cons(String name){
        this.name = name;
        System.out.println(name);
    }
}
public class constructoroverloading{
    public static void main(String args[]){
        Cons c = new Cons();
        Cons c1 = new Cons("Divyanshu.");
    }
}