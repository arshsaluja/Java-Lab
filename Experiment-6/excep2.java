//wap to enable the user handle any chance of divide by zero exception
import java.util.*;
class excep2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a num1");
int num1=sc.nextInt();
System.out.println("Enter num2");
int num2=sc.nextInt();
int div=0;
try
{
div=num1/num2;
}
catch(ArithmeticException e)
{
System.out.println("Handled any chance of divide by zero exception"+ e);
}
System.out.println(div);
}
}
