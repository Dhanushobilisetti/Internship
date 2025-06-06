import java.util.*;

class Rotations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
	{
            a[i] = sc.nextInt();
        }
        int l = 0, h = n - 1;
        while (l < h) 
	{
            int m = (l + h) / 2;
            if (a[m] > a[h]) 
	    {
                l = m + 1;
            } else {
                h = m;
            }
        }
        
        System.out.println("Smallest element in the rotated array is: " + a[l]);
    }
}
