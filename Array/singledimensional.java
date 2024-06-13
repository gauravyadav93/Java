import java.util.Arrays;
class Array{
    void display(){
        int a[] = {1,2,3,4,5};
        for(int i=0; i<a.length;i++){
            System.out.println("Array Element:" + a[i]);
        }
    }
}
public class singledimensional{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}