import java.util.Arrays;
class Array{
    void display(){
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        for(int i=0; i<a.length;i++){
            System.out.println("Sum of Array Element:" + (a[i] + b[i]));
        }
    }
}
public class sum1d{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}