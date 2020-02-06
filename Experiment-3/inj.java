//private member of class is not acceptable by child class
//private member of a class is not acceptable in other class
class parent
{
	int i=10;
	private int j=20;
	void d1()
	{
	System.out.println("no. is:"+i);
	System.out.println("num is:"+j);
}
}
class child extends parent
{
	void d2()
	{
		System.out.println("no. is:"+i);
		System.out.println("num is:"+j);
	}
}
class inj
{
	public static void main(String args[])
	{
		child c= new child();
		c.d1();
		c.d2();
	}
}
