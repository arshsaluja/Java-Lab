import java.util.*;
class exp10_6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
// converts Float to float.
System.out.println("Enter a Float value that is converted to float");
Float o=sc.nextFloat();
Float o1=new Float(o);
float o2=o1.floatValue();
float o3=o1;
System.out.println(o3);
}
}
