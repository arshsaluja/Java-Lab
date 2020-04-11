//Write a Java code that converts float to Float
//converts Float to String 
//converts String to float
// converts float to String
// converts String to Float
// converts Float to float.
import java.util.*;
class exp8_6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//converts float to Float
System.out.println("Enter a float value that is converted to Float ");
float f=sc.nextFloat();
Float f1=Float.valueOf(f);
Float f2=f;
System.out.println(f2);
//converts Float to String 
System.out.println("Enter a Float value that is converted to String ");
Float q=sc.nextFloat();
Float q1=new Float(q);
String q2=Float.toString(q1);
System.out.println(q2);
//converts String to float
System.out.println("Enter a String value that is converted to float ");
String w=sc.next();
float w1=Float.parseFloat(w);
System.out.println(w1);
// converts float to String
System.out.println("Enter a float value that is converted to String ");
Float r=sc.nextFloat();
String r1=Float.toString(r);
System.out.println(r1);
// converts String to Float
System.out.println("Enter a String value that is converted to Float");
String s=sc.next();
Float s1=Float.valueOf(s);
Float s2=s1;
System.out.println(s2);
// converts Float to float.
System.out.println("Enter a Float value that is converted to float");
Float o=sc.nextFloat();
Float o1=new Float(o);
float o2=o1.floatValue();
float o3=o1;
System.out.println(o3);
}
}
