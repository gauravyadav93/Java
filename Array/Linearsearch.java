import java.util.*;
public class Linearsearch{
    public static int linearsearch(String menu[], String item){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"Samosa", "Pasta", "Icecream", "Coke"};
        String item = "Noodles";
        int calling_func = linearsearch(menu, item);
        if(calling_func == -1){
            System.out.println("Your Item not found");
        }
        else{
            System.out.println("Item is at index:" + calling_func);
        }
    }
}
