//wap  accept 3 digits (0-9) and print possible combinations 
import java.util.*;
class possible
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
int d1=sc.nextInt();
int d2=sc.nextInt();
int d3=sc.nextInt();
int c=0;int d=0;
c=d1*10+d2;
d=c*10+d3;
System.out.println(d);
c=0;d=0;
c=d1*10+d3;
d=c*10+d2;
System.out.println(d);
c=0;d=0;
c=d2*10+d1;
d=c*10+d3;
System.out.println(d);
c=0;d=0;
c=d2*10+d3;
d=c*10+d1;
System.out.println(d);
c=0;d=0;
c=d3*10+d1;
d=c*10+d2;
System.out.println(d);
c=0;d=0;
c=d3*10+d2;
d=c*10+d1;
System.out.println(d);
}
}
