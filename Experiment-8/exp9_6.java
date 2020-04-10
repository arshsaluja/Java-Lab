//Wrapper Classes
import java.util.*;
class exp9_6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//6.>    converts Integer to int
System.out.println("Enter an Integer value (Wrapper)");
int n=sc.nextInt();
Integer h=new Integer(n);
int u=h.intValue();
int b=u;
System.out.println("Converted Integer value to int is   "+ b);

} 
}
