class Outer
{
	static int i=10;
	static class Inner
	{
		void display()
		{
			system.out.println(i);
		}
	}
}
class StaticNested
{
	public static void main(String args[])
	{
		Outer.Inner i=new Outer.Inner();
		i.display();
	}
}