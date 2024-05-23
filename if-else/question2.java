class percentage{
    int a,b,c,d,e;
    percentage(int a, int b, int c, int d, int e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        float per = (a+b+c+d+e)/5;
        if(per>=90 && per<100){
            System.out.println("Outsatnding your percentage " + per);
        }
        else if(per>=80 && per<90){
            System.out.println("GOod your percentage is " + per);
        }
        else if(per>=60 && per<80){
            System.out.println("Average student bcauz " + per);
        }
        else{
            System.out.println("Padhai Karo bcauz " + per);
        }

    }
}
public class question2{
    public static void main(String args[]){
        percentage p = new percentage(70,80,90,75,80);
    }
}