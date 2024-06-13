import java.util.Arrays;
class Array{
    void display(){
        int a[] = {1,2,3,4,5};
        int max = a[0];
        int min = a[0];
        for(int i=0; i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum Array Element:" + max);
        System.out.println("Minimum Array Element:" + min);
    }
}
public class maximum{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}