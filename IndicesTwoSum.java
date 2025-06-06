import java.util.*;

class TwoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, target;
        System.out.println("Enter n value: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter target: ");
        target = sc.nextInt();
        System.out.println("Enter Sorted Array Elements: ");
        for (int i = 0; i < n; i++) 
	{
            a[i] = sc.nextInt();
        }

        int[] result = TwoSumIndices(a,n,target);
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found");
        }
    }

    static int[] TwoSumIndices(int[] a, int target,int n)
    {
        for (int i = 0; i < n; i++) 
	{
                for (int j = i+1; j < n; j++) 
                { 
                    if (a[i]+a[j]==target)
		    {
                        return new int[]{i,j}; 
                    }
                }
   
        }
        return new int[]{-1, -1}; 
    }
}
