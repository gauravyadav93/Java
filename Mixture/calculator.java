import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                    System.out.println("Sum is: " + (a+b));
                    break;
            case '-':
                    System.out.println("Difference is: " + (a-b));
                    break;
            case '*':
                    System.out.println("Product is: " + (a*b));
                    break;
            case '/':
                    System.out.println("Division is: " + (a/b));
                    break;
            case '%':
                    System.out.println("Modulus is: " + (a%b));
                    break;
            default:
                    System.out.println("Enter correct operator.");        
        }
    }
}