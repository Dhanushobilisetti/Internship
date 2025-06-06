import java.util.*;
class Average
{
	 public static void replaceWithAverages(int[] arr) {

	{
		int arr=new int[5];
		int n=arr.length;
		double avg=0;
		for(int i=0;i<n;i++)
		{
			avg+=arr[i];
			arr[i]=(int) Math.round(avg / (i + 1));
		}

        }
	
}
	public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        replaceWithAverages(arr);
        System.out.println(Arrays.toString(arr));
    }
}











 