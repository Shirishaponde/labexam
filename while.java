class While
{
 public static void main(String []arg)
  {
   int number=349,reverse=0;
	while(number!=0)
	{
	 int reminder=number%10;
	 reverse=reverse*10+reminder;
	 number=number/10;
	}
	System.out.println("the reverse of the given number is:"+ reverse);
 }
}
