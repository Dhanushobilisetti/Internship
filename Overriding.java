class A
{
	void disp()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("child class ");
	}
}
class Super
{
	public static void main(String args[])
	{
		new B().disp();
		new B().display();
	}
}

