class Person{
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class privatevar{
    public static void main(String args[]){
    Person p1 = new Person();
    p1.setName("Java");
    System.out.println("My name is " +  p1.getName());
    }
}