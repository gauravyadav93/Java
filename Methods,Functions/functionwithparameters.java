import java.util.*;
public class functionwithparameters{               // creating a class.
    public static void display(int n){ 
        int i = 0;       // user defined function/method.
        for( i = 0; i<=n; i++){
            System.out.println("This is java programming.");
        }
}
    
    
public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    display(n);               // calling display function in main function.
}
}
