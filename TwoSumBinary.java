import java.util.*;
class TwoSumBinary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.println("Enter Target value: ");
		int t=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a[i] value: ");
			a[i]=sc.nextInt();
		}
		int r[]=isTwoSum(a,n,t);
		System.out.println("The pair indices is: ");
		for(int i=0;i<r.length();i++)
		{
			System.out.println(r[i]+" ");
		}
	}
	public static int isTwoSum(int a[],int n,int t)
	{
	
	
			int r=isBinarySearch(t-a[i],a,i+1,n-1);
			if(r!=-1)
			{
				return new int[]{i,r};
			}
		}
		return new int[]{-1,-1};
	}
	public static int isBinarySearch(int a[],int l,int h,int x)
	{
		while(l<h)
		{
			int m=(l+h)/2;
			if(a[m]==x)
			{
				return m;
			}
			else if(a[m]>x)
			{
				h=m-1;
			}
			else
			{
				l=m+1;
			}
		}
	}
}
				
		

		
		