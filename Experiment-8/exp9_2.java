//Wrapper Classes-wap in java that 
//2.>   converts Integer to String 
import java.util.*;
class exp9_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//2.>   converts Integer to String 
System.out.println("Enter an Integer value (Wrapper)");
int q=sc.nextInt();
Integer w=new Integer(q);
String e=w.toString();
System.out.println("Converted Integer to primitive String is is   "+ e);
}
}
