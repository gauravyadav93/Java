class Cons{
    String name, Course;
    int id;
    Cons(){
        System.out.println("This is default constructor");
    }
    Cons(String name, String Course){
        this.name = name;
        this.Course = Course;
        System.out.println(name+Course);
    }
    Cons(int id){
        this.id = id;
        System.out.println(id);
    }
}
public class overloading{
    public static void main(String args[]){
        Cons c = new Cons();
        Cons c1 = new Cons("Divya ","MCA");
        Cons c2 = new Cons(2311845);
    }
}