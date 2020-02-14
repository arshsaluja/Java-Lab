import java.util.*;
interface  i
{
int division(int a,int b);
int modules(int c,int d);
}
class ii implements i
{
public int division(int a,int b)
{
int div= a/b;
return div;
}
public int modules(int c,int d)
{
int m= c%d;
return m;
}
}
class exp5_4
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("enter no1 for division");
int a= sc.nextInt();
System.out.println("enter no2 for division");
int b= sc.nextInt();
System.out.println("enter no1 for mod");
int c= sc.nextInt();
System.out.println("enter no2 for mod");
int d= sc.nextInt();
ii o=new ii();
System.out.println(" division"+ o.division(a,b));
System.out.println(" mod"+ o.modules(c,d));
}
}
