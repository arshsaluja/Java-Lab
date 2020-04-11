import java.util.*;
class exp10_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//converts Float to String 
System.out.println("Enter a Float value that is converted to String ");
Float q=sc.nextFloat();
Float q1=new Float(q);
String q2=Float.toString(q1);
System.out.println(q2);
}
}
