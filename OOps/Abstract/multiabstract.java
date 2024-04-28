abstract class Demo
{
abstract void Display1();
abstract void Display2();
}class Child extends Demo
{
public void Display1()
{
System.out.println("This is first abstract method");
}
public void Display2()
{
System.out.println("This is second abstract method");
}}
public class multiabstract
{ public static void main(String args[])
{
Child c=new Child();
c.Display1();
c.Display2();
}}