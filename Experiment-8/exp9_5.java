import java.util.*;
class exp9_5
{
public static void main(String args[])
{
	Scanner sc=new Scanner (System.in);
//5.>    converts String to Integer 
System.out.println("Enter a String value");
String s2=sc.next();
Integer t=Integer.valueOf(s2);
Integer y=t;
System.out.println("Converted String value to Wrapper Integer is   "+ y);
}
}
