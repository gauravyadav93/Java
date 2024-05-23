class Demo{
    int a;
    Demo(int a){
        this.a=a;
        if(a%5==0 && a%10==0){
            System.out.println("Number is divisible by 5 and 10");
        }
        else{
            System.out.println("Number is not divisible by 5 and 10");
        }
    }
}
public class parameterized{
    public static void main(String args[]){
        Demo d = new Demo(20);
    }
}