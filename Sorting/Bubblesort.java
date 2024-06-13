import java.util.*;

public class bubblesort{
    public static void Bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            //if array is already sorted then for better optimization we use swaps variable.
            int swaps = 0;
            if(swaps != 0){
                break;
            }
            else{
            for(int j=0;j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
    }
}
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        Bubblesort(arr);
        printArr(arr);
    }
}