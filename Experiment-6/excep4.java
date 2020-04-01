//Write a java program to throw an exception  for an employee details.
//·         If an employee name is a number, a name exception must be thrown.
//·         If an employee age is greater than 50, an age exception must be thrown.
//·         Or else an object must be created for the entered employee details
// Using (Character.isDigit(name.charAt(0))==true)
import java.util.*;
class excep4
{
void emp_name(String name)
{
String n="ashmeet";
if(Character.isDigit(name.charAt(0))==true)
{
throw new NumberFormatException("Not valid");
}
else{
System.out.println("This name is valid:  "+name);
}
}
void emp_age(int age)
{
if(age>50)
{
throw new ArithmeticException("not valid");
}
else
{
System.out.println("valid");
}
}
public static void main(String args[])
{
excep4 e=new excep4();
try{
e.emp_name(args[0]);
}
catch(NumberFormatException we)
{
System.out.println("Name Exception caught"+ we);
}
try{
e.emp_age(Integer.parseInt(args[1]));
}
catch(ArithmeticException w)
{
System.out.println("Age Exception caught"+ w);
}
}
}
 
