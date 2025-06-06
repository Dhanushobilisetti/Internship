interface Shape
{
	void draw();
}
interface Shape1
{
	 void draw();
}
class Circle implements Shape,Shape1
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
class Main
{
	public static void main(String args[])
	{
		Circle s = new Circle();
		s.draw();
	}
}