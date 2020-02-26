//wap for a user interface of a library user,user interface should contain common choices like
//display the info,issue and return the books
import java.util.*;
interface A
{
void disp_info(int id,String name);
void issue_books(int book);
void return_books(int r);
}
class exp6_3 implements A
{
public void disp_info(int id,String s)
{
System.out.println("the id and name of the user is "+id +s);
}
public void issue_books(int book)
{
System.out.println("the books issued by the user are"+ book);
}
public void return_books(int r)
{
System.out.println("the no of books returnd by the user are"+r);
}
}
class exp6_4
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the id");
int id =sc.nextInt();
System.out.println("enter the name");
String name=sc.nextLine();
System.out.println("enter the books issued and returnd ");
 int book =sc.nextInt();
 int r= sc.nextInt();
 exp6_3 e=new exp6_3();
 e.disp_info(id,name);
 e.issue_books(book);
 e.return_books(r);
}
}
