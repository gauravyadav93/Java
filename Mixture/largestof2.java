import java.util.*;
public class largestof2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // taking user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        // using conditional statement.
        if(a>b){
            System.out.println(a + " is greater.");
        } else{
            System.out.println(b + " is greater.");
        }


    }
}