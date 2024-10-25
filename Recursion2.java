public class Recursion2
{
 public static void main(String arg[])
 {
  long nFactorial=factorialprogram(10);
  System.out.println(nFactorial);
 }
  public static long factorialprogram(long n)
 {
 if(n<=1)
 {
 return 1;
 }else
 {
 return n+factorialprogram(n-1);
}
}
}