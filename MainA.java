abstract class Dhan
{
	abstract void draw();
}
class rectangle extends Dhan
{
	void draw()
	{
		System.out.println("Rectangle");
	}
class circle extends Dhan
{
	void draw()
	{
		System.out.println("Circle");
	}
}
}
class MainA
{
	public static void main(String args[])
	{
		Dhan s1;
		D1=new Rectangle();
		D1.draw();
		D1=new Circle();
		D1.draw();
	}
}