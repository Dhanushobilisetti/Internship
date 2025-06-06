class A
{
	final void display()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("child class");
	}
}
class c
{
	public static void main(String args[])
	{
		B b=new B();
		b.display();
	}
}
	
