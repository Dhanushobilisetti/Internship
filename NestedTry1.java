class NestedTry1
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				try
				{
					int a[]={1,2,3,4};
					System.out.println(a[6]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array Index Out Of Bounds Exception occurs");
				}

			}
			catch(NullPointerException e)
			{
				System.out.println("Null pointer Exception occurs");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("General Exception");
		}
		System.out.println("Rest of the code");
	}
}