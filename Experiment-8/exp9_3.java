import java.util.*;
class exp9_3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//3.>    converts String to int.
System.out.println("Enter the String value :");
String str=sc.next();
// we can use Integer.parseInt(str)  or Integer.valueOf(str).
int r=Integer.valueOf(str);
System.out.println("Converted String to primitive int is   "+ r);

} 
}
