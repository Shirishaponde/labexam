class Myvehicle
{
void run()
{
System.out.println("vehicle is running ");
}
}
class Bike2 extends Myvehicle
{
void run()
{
System.out.println("Bike is running safely");
}
}
public class Bike{
public static void main(String []args)
{
Bike2 obj=new Bike2();
obj.run();
}
}

