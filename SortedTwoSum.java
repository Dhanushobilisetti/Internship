import java.util.*;
class TwoSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,a[],target;
		System.out.println("Enter n value: ");
		 n=sc.nextInt();
		System.out.println("Enter target: ");
		 t=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(isTwoSum(a,n,t))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("NotPresent");
		}
		
	}
	boolean isTwoSum(int a[],int n,int t)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				if((a[i]+a[j]==t))
				{
					return true;
				}
			}
		}
		return false;
	}
}