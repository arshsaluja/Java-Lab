//print fibonacci series using loop
import java.util.*;
class Fib_for
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int a=0;
int b=1;
int c=0;
System.out.print(a);
System.out.print(b);

for(int i=2;i<num;i++)
{
 c=a+b;
System.out.print(c);
a=b;
b=c;
}
}	
}
