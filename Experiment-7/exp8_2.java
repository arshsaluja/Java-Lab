//wap that converts all the characters of a string in capital letters 
//(Use String buffer to store the string)dont use built in function.
import java.util.*;
class exp8_2
{
public static void main(String args[])
{
StringBuffer str= new StringBuffer();
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string buffer");
str.append(sc.nextLine());
String str1 = str.toString();
String str2=str1.toUpperCase();
System.out.println("The converted string buffer input  in capital letters string is:"+str2);
}
}
