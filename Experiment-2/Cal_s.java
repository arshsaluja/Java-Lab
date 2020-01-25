// command line calculator 
//a calculator is one 
import java.util.*;
class Cal_s
{
public static void main(String args[])
{
int sum=0;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
String c=args[2];
if(c.equals("+"))
{
 sum=a+b;
System.out.println(sum);
}
else if(c.equals("-"))
{
 sum=a-b;
System.out.println(sum);
}
else if(c.equals("*"))
{
 sum=a*b;
System.out.println(sum);
}
else if(c.equals("/"))
{
 sum=a/b;
System.out.println(sum);
}
else
System.out.println("wrong input");
}
}
