class check{
    int x;
    int y;
    int z;
    check(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        if(x == 2){
            System.out.println("X is equal to 2");
        }
        else{
            System.out.println("X is not equal to 2");
        }
        if(x != 5){
            System.out.println("X is not equal to 5");
        }
        else{
            System.out.println("X is equal to 5");
        }
        if(x != 5 && y >=5){
            System.out.println("X is not equal to 5 and Y is greater than equal to 5");
        }
        else{
            System.out.println("Invalid");
        }
        if(z != 0 ||  x== 2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(!(y<10)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
public class question{
    public static void main(String args[]){
        check c = new check(2,5,10);
    }
}