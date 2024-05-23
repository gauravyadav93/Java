class Find{
    int a,b,c;
    Find(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    
    if(a>b && a>c){
        System.out.println(a + " is greater amongst three");
    }
    else if(b>c && b>a){
        System.out.println(b + " is greater amongst three");
    }
    else{
        System.out.println(c + " is greater amongst three");
    }
}
}
public class greatest{
    public static void main(String args[]){
        Find f = new Find(12,25,56);
    }
}