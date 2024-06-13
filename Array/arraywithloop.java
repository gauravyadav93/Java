class Array{
    void display(){
        int [] arr = {1,2,3,4,5};
        int pro = 1;
        for(int i=0;i<arr.length;i++){
            pro *= arr[i];
        }
        System.out.println("Product of all the elements of array:" + pro);
    }
}
public class arraywithloop{
    public static void main(String args[]){
        Array a = new Array();
        a.display();
    }
}