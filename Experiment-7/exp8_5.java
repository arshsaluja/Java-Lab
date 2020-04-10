//Wrapper Classes-wap in java that 1. >convert int to Integer ,
//2.>   converts Integer to String ,
//3.>    converts String to int,
//4.>    converts int to  String ,
//5.>    converts String to Integer ,
//6.>    converts Integer to int.
import java.util.*;
class exp8_5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//1.>   converts int to Integer-Autoboxing
System.out.println("Enter a int value(Primitive)");
int i=sc.nextInt();
Integer j=Integer.valueOf(i);
Integer k=i;
System.out.println("Converted int value to Wrapper Integer is   "+ j);
//2.>   converts Integer to String 
System.out.println("Enter an Integer value (Wrapper)");
int q=sc.nextInt();
Integer w=new Integer(q);
String e=w.toString();
System.out.println("Converted Integer to primitive String is is   "+ e);
//3.>    converts String to int
System.out.println("Enter the String value :");
String str=sc.next();
// we can use Integer.parseInt(str)  or Integer.valueOf(str)
int r=Integer.valueOf(str);
System.out.println("Converted String to primitive int is   "+ r);
//4.>    converts int to  String 
System.out.println("Enter an int value ");
int p = sc.nextInt();
String  s1= Integer.toString(p);
System.out.println("Converted int to String is   "+ s1);
//5.>    converts String to Integer 
System.out.println("Enter a String value");
String s2=sc.next();
Integer t=Integer.valueOf(s2);
Integer y=t;
System.out.println("Converted String value to Wrapper Integer is   "+ y);
//6.>    converts Integer to int
System.out.println("Enter an Integer value (Wrapper)");
int n=sc.nextInt();
Integer h=new Integer(n);
int u=h.intValue();
int b=u;
System.out.println("Converted Integer value to int is   "+ b);

} 
}
