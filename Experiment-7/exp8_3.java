//wap in java to read a statement from console  ,convert it to upper case and again print on console
//dont use inbuilt function
import java.util.*;
class exp8_3
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();
String str1=str.toUpperCase();
System.out.println("Read a statement from the console and converted it to upper case:"+str1);
}
}
