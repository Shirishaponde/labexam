class Family
{
String surname;
String name;
String relation;
 public static void main(String args[])
  {
    Family s1=new Family ();
  	s1.surname="ponde";
	s1.name="vykuntappa";
	s1.relation="grandfather";
    Family s2=new Family();
	s2.surname="ponde";
	s2.name="yashodamma";
	s2.relation="grandmother";
	System.out.println(s1.surname+" "+s1.name+" "+s1.relation);
	System.out.println(s2.surname+" "+s2.name+" "+s2.relation);

	
  }
}