import java.util.Arrays;
class Array{
    void display(){
        int ori[] = {1,2,3,4,5};
        int fak[] = Arrays.copyOf(ori,ori.length);
        System.out.println(Arrays.toString(fak));
        
    }
}
public class copy{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}