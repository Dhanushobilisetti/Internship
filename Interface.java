interface I1
{
	void a();
}
interface I2
{
	void b();
}
interface I3 extends I2
{
	void c();
}
abstract class AC implements I3
{
	public void c()
	{
		System.out.println("C");
	}
}
class Inter extends AC
{
	public void a()
	{
		System.out.println("A");
	}
	public void b()
	{
		System.out.println("B");
	}
}
class InterfaceInheritance2
{
	public static void main(String args[])
	{
		new Inter().a();
		new Inter().b();
		new Inter().c();
	}
}