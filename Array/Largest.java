import java.util.*;
public class Largest{
    public static int largest_num(int num_arr[]){
        
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<num_arr.length; i++){
            if(num_arr[i]>largest){
                largest = num_arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num_arr[] = {1, 3, 4, 5, 78, 0};

        System.out.println("Largest number is:" + largest_num(num_arr));
    }
}