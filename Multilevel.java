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
class c extends B
{
	void get()
	{
		System.out.println("child class");
	}
}
class Multilevel
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.display();
		c b1=new c();
		b1.show();
		b1.get();

	}
}
		
		