class SimpleIntrest{
    void Display(){
        int p = 1000;
        int r = 2;
        int t = 3;
        int si = (p*r*t)/100;
        System.out.println("Simple Intrest is " + si);
    }
}
public class Si_intrest {
    public static void main (String args[]){
        SimpleIntrest d = new SimpleIntrest();
        d.Display();
    }
}