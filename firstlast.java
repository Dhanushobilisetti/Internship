import java.util.*;
class FirstLast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.println("Enter x value: ");
		int x=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int[] result = firstAndLast(a, n, x);
		public static int firstandlast(int a[],int n,int x)
		{
			intfirst=-1;
			int last=-1;
			for(int i=0;i<n;i++)
			{
				if(first=-1)
				{
					first=i;
				}
				last=i;
			}
		}
		 return new int[]{first, last};
	}
}


			

		

	
	