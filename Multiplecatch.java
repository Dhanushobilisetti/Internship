class MultipleCatch1
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[6]=10);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("General exception");
		}
		System.out.println("Rest of the code");
	}
}