class Student{
    private String name;
    private String address;
    public void setDetails(String n,String a){
        name = n;
        address = a;
    }
    public void getDetails(){
        System.out.println(name + " " + address);
    }
}
public class twoparameters{
    public static void main(String args[]){
    Student s = new Student();
    s.setDetails("Java","Kanpur");
    s.getDetails();
    }
}