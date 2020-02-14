import java.util.*;
interface test
{
int square(int a);
}
class arithmetic implements test
{
public int square(int a)
{
int sq= a*a;
return sq;
}
}
class ToTestInt
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the no");
int a= sc.nextInt();
arithmetic ar= new arithmetic();
System.out.println(ar.square(a));
}
}
