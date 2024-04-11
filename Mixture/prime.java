import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // num variable for taking user input.

        // use of if else statements also called entry controlled loops.

        if(num == 2){
            System.out.println("2 is Prime");
        }
        else{
            boolean isprime = true;  // initially let num is prime then check.
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i == 0){           // n is multiple of i.
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("Num is prime");
            }
            else{
                System.out.println("num is not prime");
            }
        }
}
}