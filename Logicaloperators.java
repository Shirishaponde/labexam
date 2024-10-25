public Class Logicaloperators
{
 public static void main(String[]arg)
 {
  int x=2,y=3,z=4;
  System.out.println("Result of("+x+">"+y+")&&("+z+">"+x+")");
  System.out.println((x>y)&&(z>x));

  System.out.println("Result of("+x+">"+y+")&&("+z+"<"+x+")");
  System.out.println((x>y)&&(z<x));

  System.out.println("Result of("+y+"<"+x+")||("+z+">"+x+")");
  System.out.println((y<x)||(z>x));

  System.out.println("Result of("+y+">"+x+")||("+z+">"+x+")");
  System.out.println((y>x)||(z>x));

  System.out.println("Result of("+y+">"+x+")||("+z+">"+x+")");
  System.out.println((y>x)||(z>x));

  System.out.println("Resul tof(!"+x+"=="+y+")");
  System.out.println(!(x==y));

  System.out.println("Result of(!"+x+">"+y+")");
  System.out.println(!(x>y));
}
} 
