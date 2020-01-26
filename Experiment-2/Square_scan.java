//accept 10 no in an array and compute the square of each number.
// print the sum of these numbers
import java.util.*;
class Square_scan
{
public static void main(String args[])
{
int s=0;int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the 10 nos in the array");
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<10;j++)
{
s=arr[j]*arr[j];
sum=sum+s;
}
System.out.println("the sum of squares of the nos are:"+sum);
}
}
