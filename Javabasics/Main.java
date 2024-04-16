class Average{
    void Display(){      // It is an machine code 

        int a = 10;
        int b = 20;
        int c = 10;
        int d = 20;
        int e = (a+b+c+d)/4;
        System.out.println("Average is" + e);
    }
}
public class Main{
    public static void main(String args[]){
        Average d = new Average();
        d.Display();
    }
}