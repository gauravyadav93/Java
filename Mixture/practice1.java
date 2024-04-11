import java.util.*;
public class practice1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float costprice = pencil + pen + eraser;
        System.out.println("Without Gst:" + costprice);
        float gst = 0.18f*costprice;
        //float gst = (float)((18/100)*costprice);       not right
        System.out.println("Gst is:" + gst);
        float totalcost = costprice + gst;
        System.out.println("Bill is:" + totalcost);

    }
}