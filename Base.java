abstract class Sunstar
{
abstract void Printlnfo();
}
class Employee extends Sunstar
{
void Printlnfo()
{
String name="shirisha";
int age=21;
float salary=222.2F;
System.out.println(name);
System.out.println(age);
System.out.println(salary);
}
}
class Base
{
public static void main(String []args)
{
Sunstar s=new Employee();
s.Printlnfo();
}
}

