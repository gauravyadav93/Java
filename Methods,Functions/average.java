import java.util.*;

public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num_1:");
        double num_1 = sc.nextDouble();
        System.out.print("Enter num_2:");
        double num_2 = sc.nextDouble();
        System.out.print("Enter num_3:");
        double num_3 = sc.nextDouble();
        System.out.print("Average of three num is:" + ave(num_1,num_2,num_3));
    }
    public static double ave(double num_1,double num_2,double num_3){
        return (num_1 + num_2 + num_3)/3;
    }
    
}
