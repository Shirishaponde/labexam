import java.util.Arrays;
public class Checkarraysequal
{
 public static void main(String args[])
 {
  int a[]={10,20,30};
  int b[]={10,20,30};
  boolean result= Arrays.equals(a,b);
  if(result ==true)
   {
    System.out.println("two array are equal");
   } 
else 
   {
    System.out.println("two array are not equal");
   }  
  }
}