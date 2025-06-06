class Nested
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				try
				{
					int a[]={1,2,3,4,5};
					System.out.println(a[6]);
				}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println(e);
					}
			
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}