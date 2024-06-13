import java.util.Arrays;
class Array{
    void display(){
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum of Array Element:" + sum);
    }
}
public class sumofele{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}