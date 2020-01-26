import java.util.*;
public class Marks_scan
{
public static void main(String args[])
{
int temp;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the student marks");
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
sc.close();
for(int j=0;j<10;j++)
{
for(int k=(j+1);k<10;k++)
{
if(arr[j]>arr[k])
{
temp=arr[j];
arr[j]=arr[k];
arr[k]=temp;
}
}
}
for(int l=0;l<10;l++)
{
if(arr[l]>=40&&arr[l]<=50)
System.out.println(arr[l]+"PASS");
else if(arr[l]>=51&&arr[l]<=75)
System.out.println(arr[l]+"MERIT");
else if(arr[l]>=76)
System.out.println(arr[l]+"DISTINCTION");
else
System.out.println("FAIL");
}
}
}
