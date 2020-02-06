//wa class worker and derive classes daily_worker and salaried worker every worker has a name and and
//salary rate write method compay() with argumenet int hours to compute the weekly pay of every worker
//a salaried worker is given a weekly pay for 40 hours regardless of the actual hours completed
//test this program to calculate the pay of workers use polymorphism for this program

class worker
{
String name="bajaj";
int s_rate= 150;

}
class daily_worker extends worker
{
void compay(int hours)
{
System.out.println(s_rate*hours);
}
}
class salaried_worker extends worker
{
void compay(int hours)
{
System.out.println(s_rate*40);
}
}
class Wa
{
public static void main(String args[])
{

daily_worker k= new daily_worker();
k.compay(48);
salaried_worker j=new salaried_worker();
j.compay(48);
}
}
