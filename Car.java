class Myvehicle {
protected String brand ="Ford";
public  void honk()
{
System.out.println("Tuut tuut");
}
}
class Car extends Myvehicle 
{
private String modelname ="Mustang";
public static void main(String []args)
{
Car myfastcar=new Car();
myfastcar.honk();
  System .out.println(myfastcar.brand+" "+myfastcar.modelname);
}
}
