class Student{
public void show(){
System.out.println("student details.");
}
}
public class Collagestudent extends Student{
public void show()
{
System.out.println("Collagestudent details.");
}
public static void main(String[]args){
Student obj=new Collagestudent();
obj.show();
}
}