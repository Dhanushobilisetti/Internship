interface Shape
{
	void draw();
}
interface Rectangle extends Shape
{
	 void draw();
}
interface circle extends Shape
{
	 void draw();
}
class Den implements Rectangle
{
	public void draw()
	{
		System.out.println("Hi bro");
	}
}
class Main
{
	public static void main(String args[])
	{
		Shape s;
		s=new Den();
		s.draw();
		s=new Den();
		s.draw();
	}
}
