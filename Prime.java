public class Prime
 {
  public static void main(String[]arg)
  {
   int n=23;
   int count=5;
   if (n<=1)
   {
    System.out.println("the number is not prime");
    return;
   }
{ for (int i=2;i<=n;i++)
  {
   if (n%2==0)
    {
     count++;
    }
   }
    if(count<1)
    {
     System.out.println("the number is not prime");
    }else{
      System.out.println(n+"the number is prime");
    }
  }
}
}