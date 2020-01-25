import java.util.*;
class Largest_scan
{
public static void main(String args[])
{
Scanner sc= new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c)
System.out.println("largest is a:"+ a);
else if(b>a&&b>c)
System.out.println("largest is b:"+ b);
else
System.out.println("largest is c:"+ c);
}
}
