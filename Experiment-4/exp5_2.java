interface A
{
void meth1();
void meth2();
}
class MyClass implements A
{
public void meth1()
{
System.out.println("This is method one");
}
public void meth2()
{
System.out.println("This is method two");
}

}
class exp5_2
{
public static void main(String args[])
{
MyClass m= new MyClass();
m.meth1();
m.meth2();
}
}
