import java.util.Arrays;
class Array{
    void display(){
        int a[] = new int[5];
        Arrays.fill(a, 1);
        for(int i:a){
            System.out.println(i);
        }
    }
}
public class arrayfilljava{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}