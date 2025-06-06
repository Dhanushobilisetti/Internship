class A
{
	void display()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Intermediate class");
	}
}
class c extends A
{
	void get()
	{
		System.out.println("child class");
	}
}
class Hierarichal
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.display();
		b1.show();
		c c1=new c();
		c1.get();

	}
}
		
		