package p3;
import balance.Account;
import java.util.*;
class exp6_3
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int b= sc.nextInt();
Account a= new Account();
a.disp_balance(b);
}
}
//javac Account.java
//javac exp6_3.java
//java p3.exp6_3
//output
//500
//the balance is500
