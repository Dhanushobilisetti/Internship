class NestedTry2
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=10/0;
				System.out.println(a);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception occurs");
			}
			try
			{
				String s=null;
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception occurs");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception occurs");
		}
	System.out.println("rest of the code");
	}
}