class Finally2
{
	public static void main(String args[])
	{
		try
		{
			int a=25/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block gets executed");
		}
		System.out.println("Rest of the code");
	}
}