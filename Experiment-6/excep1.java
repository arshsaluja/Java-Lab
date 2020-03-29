//Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students.
//Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program
import java.util.*;
public class excep1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int roll_no[]=new int[10];
String name[]= new String[10];
System.out.println("enter the name of the students");
System.out.println("enter the roll_ no of the students");
try
{
for(int i=0;i<10;i++)
{
name[i]=sc.next();
}
for(int i=0;i<10;i++)
{
roll_no[i]=sc.nextInt();
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
finally
{
System.out.println("this will always execute");
}
for(int i=0;i<10;i++)
{
	System.out.println("The Roll Number and the Name of the student is"+ roll_no[i]+ name[i]);
}
}
}
