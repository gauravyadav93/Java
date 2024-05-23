interface Method1{
    abstract void disp1();
}
interface Method2 extends Method1{
    abstract void disp2();
}
class C implements Method2{
    int principle;
    int rate;
    int time;
    C(int principle,int rate,int time){
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }
    public void disp1(){
        System.out.println("This is method 1.");
    }
    public void disp2(){
        System.out.println("This is method 2.");
    }
}
class D extends C{
    D(int principle,int rate,int time){
        super(principle,rate,time);
    }
    void display(){
        int S_I = (principle*rate*time)/100;
        System.out.println("Simple interest is:"+S_I);
    }
}
public class extendedinterface{
    public static void main(String args[]){
        D d = new D(100,5,2);
        d.display();

    }
}