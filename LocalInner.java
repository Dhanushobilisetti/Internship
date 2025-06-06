class Outer
{
	void disp()
	{
		class Inner
		{
			void show()
			{
				System.out.println("Local inner class");
			}
		}
		new Inner().show();
	}
}
class Local
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.disp();
	}
}