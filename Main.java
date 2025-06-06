class Base
{
	void display()
	{
	}
	i=10;
}
class Child extends Base
{
	i=20;
	System.out.println(super.i);
	System.out.println(i);
}
class Main
{
public static void main(String args[])
{
	Chi zdd c=new Child();
}
}
 