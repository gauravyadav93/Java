import java.util.*;
public class whileloop{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 
    // while loop for printing natural number given by user.

    int num = sc.nextInt();
    int i=1;
     while(i<=num){
        System.out.println(i);
        i++;
     }
    }
}