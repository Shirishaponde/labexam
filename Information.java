class Information
{
 int id;
 String name;
 int mobno;
 float fee;
  public static void main(String arg[])
  {
   Information s1=new Information();
	s1.id=1;
	s1.name="ria";
	s1.mobno=1111111111;
	s1.fee=72000;
	System.out.println(s1.id+" "+s1.name+" "+s1.mobno+" "+s1.fee);
    Information s2=new Information();
	s2.id=2;
	s2.name="sia";
	s2.mobno=222222222;
	s2.fee=72000;
	System.out.println(s2.id+" "+s2.name+" "+s2.mobno+" "+s2.fee);
    Information s3=new Information();
	s3.id=3;
	s3.name="lia";
	s3.mobno=333333333;
	s3.fee=72000;
	System.out.println(s3.id+" "+s3.name+" "+s3.mobno+" "+s3.fee);
Information s4=new Information();
	s4.id=4;
	s4.name="mia";
	s4.mobno=444444444;
	s4.fee=72000;
	System.out.println(s4.id+" "+s4.name+" "+s4.mobno+" "+s4.fee);

}
}