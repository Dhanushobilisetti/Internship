class Outer
{
	int i=30;
	class Inner
	{
		void show()
		{
			System.out.println(i);
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.show();
	}
}