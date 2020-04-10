//Wrapper Classes-wap in java that 1. >convert int to Integer 
import java.util.*;
class exp9_1
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
}
}
