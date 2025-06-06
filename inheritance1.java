class Base
{
	void display()
	{
		System.out.println("Base class");
	}
}
class Child extends Base
{
	void get()
	{
		System.out.println("Child class");
	}
}
class Main
{
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.display();
		c1.get();
	}
}