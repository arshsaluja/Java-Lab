//wap for searching strings for first occourence of characters or substring and for the last occourence 
//of characters or substring
import java.util.*;
class exp8_1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
System.out.println("enter the character or substrinng to be searched");
String s=sc.next();
int firstIntdex=str.indexOf(s);
System.out.println("Returns the first index of the given substring or character"+ firstIntdex);
int lastIntdex=str.lastIndexOf(s);
System.out.println("Returns the last index of the given substring or character"+ lastIntdex);
}
}
