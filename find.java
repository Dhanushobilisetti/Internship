import java.util.*;
class Number
{
	public static int  find(int arr[])
	{

		int d=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;
			while(arr[i]==1 && j<arr.length)
			{
				if(arr[j+1]==0)
				{
					c++;
				}
				j++;
			}
			 d+=c;
		}
		return d;
	}
	public static void main(String args[])
	{

		int arr[]={1,0,1,0,0,1};
		System.out.println(find(arr));
	}
}
		
			