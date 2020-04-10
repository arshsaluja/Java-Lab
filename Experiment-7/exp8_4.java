//wap in java to create a String Object.
//Initialize this object with ur name .
//Find the length of your name using appropriate string method.
//Find whether the character 'a' is in your name or not ;
//if yes  find the no of times 'a' appears in your name .
//Print locations of occourences of 'a'.
//Try the same for different string objects.
import java.util.*;
class exp8_4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String str=sc.next();
int l=str.length();
String s=str.toLowerCase();
int count=0;
System.out.println("The length of your name is:"+l);
for(int i=0;i<l;i++)
{
if(s.charAt(i)=='a')
{
count++;
System.out.println("'a' occours in my name at location number:"+ i);
}
}
System.out.println("The no of time 'a' occours in my name is"+count);
}
}
