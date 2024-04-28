abstract class Demo
{
abstract int Display1(int a, int b);
abstract void Display2();
}
class Child extends Demo
{
public int Display1(int a, int b)
{
return (a+b);
}
public void Display2()
{
System.out.println("This is second abstract method");
}}
public class abstwithpara
{ public static void main(String args[])
{
Child c=new Child();
System.out.println("Addition is" + c.Display1(25,30));
c.Display2();
}}