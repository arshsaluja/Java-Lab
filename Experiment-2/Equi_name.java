//input the no of the month(1-12)and print its equivalent name of the month
import java.util.*;
class Equi_name
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of the month:");
int no=sc.nextInt();
switch(no)
{
case 1:
     System.out.println("Jan");
     break;
case 2:
     System.out.println("Feb");
     break;
case 3:
     System.out.println("March");
     break;
case 4:
     System.out.println("April");
     break;
case 5:
     System.out.println("MAY");
     break;
case 6:
     System.out.println("JUNE");
     break;
case 7:
     System.out.println("JULY");
     break;
case 8:
     System.out.println("AUGUST");
     break;
case 9:
     System.out.println("SEPTEMBER");
     break;
case 10:
     System.out.println("OCTOBER");
     break;
case 11:
     System.out.println("NOVEMBER");
     break;
case 12:
     System.out.println("DECEMBER");
     break;
default:
     System.out.println("invalid input");
}

}
}
