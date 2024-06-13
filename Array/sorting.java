import java.util.Arrays;
class Array{
    void display(){
        String[] fruits = {"Apple","Cherry","Banana","Dragonfruit"};
        Arrays.sort(fruits);
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
public class sorting{
    public static void main(String args[]){
        Array b = new Array();
        b.display();
    }
}