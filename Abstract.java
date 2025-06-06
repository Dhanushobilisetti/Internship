abstract class Shape
{
	Shape()
	{
		System.out.println("Creating a shape");
	}
	abstract void draw();
	void print()
	{
		System.out.println("Shape created");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle();
		s.draw();
		s.print();
		s=new Circle();
		s.draw();
		s.print();
	}
}