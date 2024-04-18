class A{
    public void display(){
        System.out.println("This is class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("This is class B");
    }
}
class C extends B{
    public void print(){
        System.out.println("This is class C");
    }
}
class multilevel{
    public static void main(String args[]){
        C c1 = new C();
        c1.display();
        c1.show();
        c1.print();
    }
}