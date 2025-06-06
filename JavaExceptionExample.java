class JavaExceptionExample
{
	public static void main(String args[])
	{
		try
		{
			int t=100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		